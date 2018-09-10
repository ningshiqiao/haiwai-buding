package com.bd.helper;

/**
 * ErrorCode
 * <p>
 * Created by weizhong on 2017/6/16.
 */
public enum ErrorCode {


    /**
     * 会话已过期，请重新登录
     */
    SESSION_EXPIRE("S00101", "Sesi telah berakhir, silahkan login lagi"),

    /**
     * 获取信审项
     */
    GET_CREDIT_AUDIT("1001012","Gagal mendapatkan periode individu"),

    /**
     * Cannot get Jedis connection
     */
    REDIS_NOT_CONN("100122","Cannot get Jedis connection!"),

    /**
     * 请求参数有误
     */
    PARAMETER_ERROR("100102", "Incorrect request parameter"),

    /**
     * 登录失败
     */
    LOGIN_FAIL("S00103", "Nama user atau kata sandi salah！"),

    /**
     * 电话号码已经被注册
     */
    PHONE_IS_REGISTER("S00104", "Nomor telepon ini telah terdaftar！"),

    /**
     * 电话号码未注册
     */
    PHONE_IS_NOT_REGISTER("S00105", "Nomor telepon ini belum terdaftar！"),

    /**
     * 短信发送失败
     */
    SMS_SEND_FAIL("S00106", "Pesan gagal mengirim!"),

    /**
     * 验证码错误
     */
    CODE_IS_ERROR("S00107", "Kode verifikasi salah!"),

    /**
     * 验证码错误
     */
    RIGISTER_FAIL("S00108", "Gagal untuk mendaftar!"),


    LOAN_INFO_ERROR("S00108", "Gagal untuk mendaftar!"),

    /**
     * 保存数据失败
     */
    SAVE_FAIL("S00200", "Failed to save data!"),

    /**
     * 删除失败
     */
    DEL_FAIL("S00201", "Gagal menghapus data!"),

    /**
     * 上传文件失败
     */
    UPLOAD_FILE_FAIL("S00202", "Gagal mengupload file!"),

    /**
     * 服务异常
     **/
    SERVICE_EXCEPTION("10100", "Server abnormal"),

    /**
     * BPJS和工作照必须上传其中之一
     */
    BJPS_WORK("W10001", "Unggah sedikitnya Foto Pekerjaan atau BPJS"),

    /**
     * BPJS照片上传必须填写社保卡号
     */
    BJPS_NO("W10002", "Nomor BPJS diperlukan jika meng-upload BPJS"),

    /**
     * 填写社保卡号必须上传BPJS照片
     */
    BJPS_URL("W10003", "Upload BPJS diperlukan jika nomor BPJS diisi"),

    /**
     * 银行卡信息有误
     */
    BANK_VERIFICATION("B10001", "Informasi kartu bank salah"),

    /**
     * 银行卡信息重复
     */
    BANK_REPEAT("B10002", "Informasi kartu bank diulang"),

    /**
     * 此银行卡不能解绑
     */
    BANK_UNBUNDLED("B10003", "Kartu ini tidak dapat dihapus"),

    /**
     * 每日0:00-6:00不支持还款
     */
    WETHERREPAYMENTS("B10004","Waktu pemeliharaan sistem: {notReplayTime} WIB Coba melakukan pembayaran pada waktu lain."),

    /**
     * 不支持绑定此银行卡
     */
    BANK_TYPE_VERIFICATION("B1005","Jenis kartu bank yang tidak didukung"),

    /**
     * 获取支持银行卡列表失败
     */
    BANK_LIST_VERIFICATION("B1006","Gagal mendapatkan daftar kartu bank"),

    DISBURSEMENTTS_BANKS("1001011","Gagal mendapatkan bank pembayar"),

    FIND_ACTIVITY("1001012","Gagal mendapatkan semua kegiata"),

    FIND_BANNER("1001013","Gagal mendapatkan banner"),

    FIND_LOAN_STRATEGY("1001014","Gagal mendapatkan petunjuk kredit"),

    FIND_PRODUCT_ERROR("1001715","Gagal mendapatkan banner"),

    FIND_ALL_BANNER("1001015","Gagal mendapatkan banner"),

    FIND_ALL_BULLETIN_MESSAGE("1001016","Gagal mendapatkan semua pengumuman"),

    GET_CARD_BY_USERID("1001017","Gagal mendapatkan kartu virtual"),

    ALL_DATE("1001019","Gagal mendapatkan semua tanggal"),

    UPLOAD_CONTACT("1001020","Upload kontak gagal"),

    UPLOAD_CALL_RECORDS("1001021","Upload log panggilan gagal"),

    UPLOAD_USER_SMS("1001022","Upload sms gagal"),

    UPLOAD_DEVICE_INFO("1001023","Upload informasi perangkat gagal"),

    RENEW("1001024","Pembaharuan gagal"),

    UPLOAD_FACEBOOK("1001025","Upload facebook gagal"),

    UPLOAD_GEO("1001026","Upload lokasi gagal"),

    SAVE_FEEDBACK("1001027","Gagal menyimpan umpan balik"),

    SAVE_INTIMATE_CONTACT("1001028","Gagal menyimpan sertifikasi sosial"),

    GET_INTIMATE_CONTACT("1001029","Data kueri gagal"),

    SAVE_KTPINFO("1001030","Gagal untuk menyimpan data"),

    FIND_KTPINFO("1001031","Gagal mendapatkan informasi ktp"),

    REUPLOAD_PICTURES("1001032","Upload gambar gagal"),

    GET_AGE("1001033","Gagal memperoleh usia"),

    GET_AGREEMENT_DATA("1001034","Gagal mendapatkan pengguna"),

    GET_AGREEMENT("1001035","Gagal mendapatkan perjanjian pinjaman"),
//
CONFIRM_LOAN("1001036","Data kueri gagal"),

    GET_LOANINFO("1001037","Gagal mendapatkan halaman Beranda pinjaman"),

    GET_CONFIRM_LOANINFO("1001038","Gagal mendapatkan halaman konfirmasi pinjaman"),

    UPDATE_CARD_BY_USERID("1001039","Gagal memodifikasi kartu utama"),

    SAVE_LOANORDER("1001040","Gagal untuk menyimpan data"),

    ORDER_PROCESSING("1001041","Gagal memperoleh pinjaman berlangsung"),

    ORDER_FINISH("1001042","Gagal mendapatkan pesanan kerja selesai"),

    LOAN_ORDER("1001043","Gagal mendapatkan pesanan kerja"),

    GET_AUDIT_ORDER("1001044","Gagal mendapatkan pesanan kerja sedang diaudit"),

    UPDATE_LOAN_STATE("1001045","Gagal memodifikasi status pesanan kerja"),

    GET_REPAYMENT("1001046","Gagal mendapatkan jumlah pelunasan"),

    LOAN_JUDGMEMT("1001047","Gagal memutuskan penyelesaian pesanan"),

    GET_MODIFY_INFORMATION("1001048","Data kueri gagal"),

    LIST_MESSAGE("1001049","Gagal mendapatkan informasi pribadi"),

    GET_MESSAGE("1001050","Gagal mendapatkan informasi pribadi"),

    SAVE_MESSAGE("1001051","Gagal menyimpan pesan"),

    DEL_MESSAGE("1001052","Gagal menghapus pesan"),

    FIND_ALL_MESSAGES("1001053","Gagal mendapatkan informasi pribadi"),

    DEL_ALL_MESSAGE("1001054","Gagal menghapus pesan"),

    ALL_HAVEREAD("1001055","Gagal menandai pesan dibaca"),

    GET_ORDER("1001056","Gagal memperoleh proses pinjaman"),

    LIST_ORDER_PROGRESS("1001057","Gagal mendapatkan pesanan kerja selesai"),

    GET_ORDER_PROGESS("1001058","Data kueri gagal"),

    ISKNOW("1001059","Data kueri gagal"),

    VERIFY_BANK_ACCOUNT("1001060","Verifikasi kartu bank gagal"),

    FUND_LIST("1001061","Gagal mendapatkan catatan transaksi"),

    SAVE_PAY_RECORD("1001062","Gagal menyimpan catatan transaksi"),

    SAVE_PERSONAL_INFO("1001063","Gagal untuk menyimpan data"),

    GET_PERSONAL_INFO("1001064","Failed to obtain personal information"),

    REPAYMENT_METHOD_LIST("1001065","Gagal mendapatkan metode pembayaran"),

    FIND_REPAYMENT_PLAN("1001066","Gagal mendapatkan rencana pembayaran"),

    SAVE_UPLOAD_PICTURES("1001067","Upload gambar gagal"),

    GET_ALL_PERIOD("1001068","Gagal mendapatkan semua periode"),

    SAVE_USER_BANK("1001069","Gagal menyimpan kartu bank"),

    LIST_PAGE_USER_BANK("1001070","Gagal mendapatkan kartu bank"),

    UNBUNDLED("1001071","Gagal menghapus kartu bank"),

    GET_USER_BANK("1001072","Gagal mendapatkan kartu bank"),

    SAVE_USERIP_HISTORY("1001073","Gagal menyimpan ip"),

    GET_USER("1001076","Gagal mendapatkan pengguna"),

    RECORDING_LOGIN("1001078","Gagal menyimpan sejarah masuk"),

    GET_VERIFY_STATE("1001079","Gagal mendapatkan proses verifikasi"),

    GET_VERIFY_INFO("1001080","Silakan membarui informasi kredit Anda"),

    FIND_VERSION_NEW("1001081","Gagal mendapatkan versi terbaru"),

    SAVE_WORK_CERTIFICATION("1001082","Gagal menyimpan informasi pekerjaan"),

    FIND_WORK_CERTIFICATION("1001083","Data kueri gagal"),

    SAVE_WORK_INFO("1001084","Gagal menyimpan informasi pekerjaan"),

    FIND_WORK_INFO("1001085","Gagal mendapatkan informasi pekerjaan"),

    LOG_OUT("1001086","Keluar gagal"),
    FBKIT_LOGIN("1001075","Nama user atau kata sandi salah"),
    FACEBOOK_LOGIN("1001074","Nama user atau kata sandi salah"),
    BIND_FACEBOOK("1001077","Gagal link facebook"),
    FIND_ALL_FAV("1001018","Data kueri gagal"),

    CLEAR_OUT("1001087","Hapus data gagal"),

    CLEAN_CACHE("1001088","Hapus data gagal"),

    DETECTION("1001089","Data kueri gagal"),

    OPERATOR("1001090","Data kueri gagal"),

    OPERATOR_CALL_BACK("1001091","Gagal memperoleh data operator"),

    FTQTLOBC("1001090","Failure to query the list of bank cards"),

    DATE_ERROR("1001091","Waktu pemeliharaan sistem: 00.00-06.00 WIB Coba melakukan pembayaran pada waktu lain."),

    /**
     * 获取bluepay fav失败
     */
    BLUE_PAY_FAV_GET_ERROR("1001093","Gagal mendapatkan fav bluepay"),

    /**
     * 获取fav失败
     */
    FAV_GET_ERROR("1001092","Gagal mendapatkan nomor virtual account"),

    /**
     * 虚拟卡号为空
     */
    FAV_NULL("1001094","Nomor virtual account kosong"),

    /**
     * 获取启动页失败
     */
    STARTUP_ERROR("1001095","Gagal mendapatkan halaman startup"),

    /**
     * 获取热门问题失败
     */
    FAILED_TO_GET_HOT_ISSUES("1001096","Gagal mendapatkan soalan popular"),

    /**
     * 获取问题答案失败
     */
    FAILED_TO_GET_ANSWERS_TO_QUESTIONS("1001097","Gagal mendapatkan jawapan kepada soalan Anda "),

    /**
     * 转入人工接口失败
     */
    FAILED_TO_ENTER_THE_MANUAL_INTERFACE("1001098","Gagal menyambung ke layanan pelanggan manual "),


    /**
     * 获取公告页失败
     */
    BULLETIN_ERROR("1001099","Data kueri gagal"),

    /**
     * 已经领取优惠券
     */
    COUPON_RECEIVED("1001100","Anda telah menerima kupon"),

    /**
     * 优惠券领取失败
     */
    COUPON_RECEIVE_FAIL("1001101","Gagal mendapatkan kupon"),

    /**
     * 优惠券领取超时
     */
    COUPON_TIMEOUT("1001102","Sayangnya, kupon tidak dapat diterima selama lebih dari 48 jam"),

    /**
     * 活动已结束
     */
    ACTIVITY_OVER("1001103","Kegiatan ini telah kedaluwarsa.<br />Menantikan untuk kegiatan baru!"),

    /**
     * 额度券不可用
     */
    //TODO 找uu翻译
    COUPON_NOT_USE("110104", "Kupon tidak tersedia, silakan pilih kembali"),

    /**
     * 数据获取失败
     */
    FIND_FAIL("S00203","Data kueri gagal"),

    /**
     * 数据修改失败
     */
    UPDATE_FAIL("S00204","Data kueri gagal"),

    /**
     * 获取地图选择标签失败
     */
    FAILED_TO_GET_MAP_SELECTION_TAG("110105","Gagal mendapatkan tag pemilihan peta"),

    /**
     * 保存用户地址失败
     */
    FAILED_TO_SAVE_USER_ADDRESS("110106","Gagal menyimpan alamat pengguna"),

    /**
     * 查询用户地址失败
     */
    FAILED_TO_QUERY_USER_ADDRESS("110107","Gagal menanyakan alamat pengguna"),

    /**
     * 删除用户地址失败
     */
    FAILED_TO_DELETE_USER_ADDRESS("110108","Gagal menghapus alamat pengguna"),

    /**
     * 邮箱地址已存在
     */
    EMAIL_IS_REGISTER("110109","The email has been registered, please re-fill"),

    /**
     * 学生卡激活失败
     */
    CARD_ACTIVATION_FAIL("110110","Telepon kantor tidak bisa sama dengan telepon rumah"),

    /**
     *  地图搜索信息保存失败
     */
    FAILED_TO_SAVE_MAP_SEARCH_CONTENT("110109","Gagal menyimpan konten pencarian peta"),

    /**
     *  额度工单保存失败
     */
    SAVE_QUOTA_ERROR("110110","Gagal menyimpan perintah kerja"),

    /**
     * 绑定watchsApp失败
     */
    BIND_WATCHSAPP_FAIL("1001011","Gagal mengikat watchsApp"),

    /**
     * 获取收货地址异常
     */
    GET_ADDRESS_ERROR("1001012","Dapatkan pengecualian alamat pengiriman"),

    REFRESH_FAIL("1001013","Dapatkan pengecualian alamat pengiriman"),

    ADDRESS_ERROR("1001014"," Alamat tidak dapat berupa angka murni"),

    /**
     * 借款金额不能大于可用额度
     */
    AVAILABLEQUOTA_NOTENOUGH("1001119","Pengajuan pinjaman tidak bisa lebih dari kredit tersedia"),

    /**
     * 借款金额不能小于最低借款金额
     */
    LOANAMOUNT_TOOMIN("1001123","Pengajuan pinjaman tidak bisa kurang dari pinjaman minimum"),

    /**
     * 学生卡已过期
     */
    CARD_VALID("1001120","Kartu Eksklusif Mahasiswa Anda telah kadaluwarsa. Silakan hubungi Layanan Pelanggan."),

    /**
     * gpa异常
     */
    GPA_ERROR("1001121","IPK harus antara 0,0-0,5"),

    /*
     * WatchsApp格式不正确
     */
    WATCHSAPP_ERROR("1001122","Format WatchsApp salah"),

    /*
     * 保存落地页信息失败
     */
    FAILED_TO_SAVE_LANDING_PAGE_INFORMATION("1001123","Failed to save landing page information"),

    /*
     * 请输入正确的口令
     */
    INCORRET_PASSWORD("1001124","请输入正确的口令"),

    /*
     * 该口令已失效
     */
    EXPIRY_PASSWORD("1001125","该口令已失效"),

    /*
     * 该口令已使用
     */
    USED_PASSWORD("1001126","该口令已使用"),

    /*
     * 抱歉您无法使用该口令
     */
    UNUSEABLE_PASSWORD("1001127","抱歉您无法使用该口令"),

    /**
     * OCR验证失败
     */
    OCR_VERIFICATION_FAILED("1001128","Verifikasi OCR gagal"),

    FIND_BULLETIN_MESSAGE_ERROR("1001129","Dapatkan pengecualian pesan push"),

    /**
     *  请填写两个不相同的联系人
     */
    PLEASE_FILL_IN_TWO_DIFFERENT_CONTACTS("1001130","Please fill in two individual contacts"),

    GET_INDEX_ERROR("1001131","Dapatkan pengecualian data halaman rumah"),

    GET_PHONE_DATA_ERROR("1001132","Dapatkan pengecualian data ponsel"),

    /**
     * 该设备无法回租借款
     */
    PHONE_NOT_RENTAL("1001133","Dapatkan pengecualian data ponsel"),

    /**
     * 该设备无法回租借款
     */
    GOODS_URL_ERROR("1001134","Please fill in the correct product URL address"),

    /**
     *
     */
    FACEURL_NOTBLANK("1001131","Foto Wajah terbaik tidak boleh kosong"),












    /**
     * 请求参数有误
     */
    FB_ALREADY_BIND("100120", "facebook already bind"),

    FACEBOOK_AUTH_FAIL_ERROR("100103", "Verifikasi FACEBOOK gagal"),

    DATA_REPEAT_ERROR("100104", "Data already exists!"),


    /**
     * 身份证号已被注册
     */
    KTPNO_IS_REGISTER("100112", "KTP number (NIK) has been registered, please re-fill!"),

    /**
     * 社保号已被占用
     */
    BPJSNO_IS_REGISTER("100113", "Nomor BPJS Kesehatan sudah diambil, silakan isi ulang！"),

    /**
     * 居住信息必须上传
     */
    RESIDENCE_UPLOADED("100118", "Informasi perumahan diperlukan!"),

    /**
     * 社保号重复
     */
    BPJSNO_REPEAT("100119", "Nomor BPJS Kesehatan terulang!"),

    /**
     * 此手机号fb已被绑定过，请更换手机号
     */
    FB_REPEAT("100120", "This phone number has been registered to another Facebook account, please change phone number"),

    /**
     * 银行卡已被绑定过
     */
    BKANNO_REPEAT("100121", "Kartu ini telah terhubung"),


    /**
     * 本用户绑定的手机号不能绑定社交联系人
     */
    INTIMATECONTACTIPHONE_REPEAT("100122", "Nomor telepon pengguna tidak dapat ditunjuk sebagai kontak sosial"),

    /**
     * 获取单个期数
     */
    GET_STRATEGY("1001012", "Gagal mendapatkan periode individu"),


    /**
     * 额度获取失败
     */
    QUOTA_GET_FAILED("1001014", "Gagal mendapatkan batas kredit"),

    /**
     * 额度获取失败
     */
    USER_QUOTA_GET_FAILED("1001015", "Gagal mendapatkan batas kredit"),

    /**
     * 额度获取失败
     */
    CARD_QUOTA_GET_FAILED("1001016", "Gagal mendapatkan batas kredit"),

    /**
     * 额度获取失败
     */
    PRODUCT_QUOTA_QUOTA_GET_FAILED("1001017", "Gagal mendapatkan batas kredit"),

    /**
     * 家庭电话不能与公司电话相同
     */
    PHONE_BINDING_COMPANYPHONE("1001018", "Home telephone cannot be the same as office telephone"),

    /**
     * 公司电话不能与家庭电话相同
     */
    PHONE_BINDING_HOMEPHONE("1001019", "Office telephone cannot be the same as home telephone"),


    /**
     * 该手机号没有在白名单内
     */
    PHONE_DEL_FAIL("1001022", "Gagal menghapus data!"),

    /**
     * user表查询失败
     */
    USER_DEL_FAIL("1001023", "Gagal menghapus data!"),

    /**
     * 借款金额小于最低借款金额
     */
    LOAN_AMOUNT_TOOMIN("1001024", "Gagal menghapus data!"),

    /**
     * 请勿频繁提交
     */
    SUBMIT_FREQUENTLY_ERROR("1001026", "Jangan sering mengirim"),

    /**
     * 本用户绑定的手机号不能绑定社交联系人
     */
    INTIMATECONTACTIPHONE_SAME("100127", "Dua kontak memiliki nomor telepon yang sama"),

    /**
     * 此Facebook已被绑定，请更换Facebook
     */
    FB_FBID_REPEAT("100127", "The facebook account has been linked by other user. Please enter another facebook account"),
    ;

    private String code;

    private String message;

    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 根据错误码获取错误信息
     *
     * @param code
     * @return
     */
    public static ErrorCode getByCode(String code) {
        for (ErrorCode errorCode : ErrorCode.values()) {
            if (code.equals(errorCode.getCode())) {
                return errorCode;
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
