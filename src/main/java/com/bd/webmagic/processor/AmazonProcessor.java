package com.bd.webmagic.processor;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.downloader.HttpClientDownloader;
import us.codecraft.webmagic.model.OOSpider;
import us.codecraft.webmagic.pipeline.ConsolePipeline;
import us.codecraft.webmagic.pipeline.MultiPagePipeline;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.proxy.Proxy;
import us.codecraft.webmagic.proxy.SimpleProxyProvider;

public class AmazonProcessor implements PageProcessor {

    private Site site;

    @Override
    public void process(Page page) {
        page.addTargetRequests(page.getHtml().links().regex("https://www.amazon.com/s/ref=sr_pg_?marketplaceID=ATVPDKIKX0DER&me=A1KP5NGF2WM32D&merchant=A1KP5NGF2WM32D").all());
        page.putField("title",page.getHtml().xpath("div[@class='s-item-container']").nodes());
        page.putField("content",page.getHtml().smartContent().toString());
    }

    @Override
    public Site getSite() {
        if (site == null) {
            site = Site.me().setDomain("www.amazon.com");
        }
        return site;
    }

    public static void main(String[] args) {
        HttpClientDownloader httpClientDownloader = new HttpClientDownloader();
        httpClientDownloader.setProxyProvider(SimpleProxyProvider.from(
                new Proxy("localhost",1080) ));
        //OOSpider.create(Site.me(), clazzMap.get(key)).addUrl(urlMap.get(key)).setDownloader(httpClientDownloader).addPipeline(new MultiPagePipeline()).addPipeline(new ConsolePipeline()).thread(5).run();
        OOSpider.create(Site.me(), AmazonProcessor.class).thread(1).addUrl("https://www.amazon.com/s/ref=sr_pg_?marketplaceID=ATVPDKIKX0DER&me=A1KP5NGF2WM32D&merchant=A1KP5NGF2WM32D").setDownloader(httpClientDownloader).addPipeline(new MultiPagePipeline()).addPipeline(new ConsolePipeline()).run();
    }
}
