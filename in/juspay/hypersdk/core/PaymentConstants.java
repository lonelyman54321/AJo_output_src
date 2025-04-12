/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.core;

public class PaymentConstants {
    public static final String ACS = "payments/in.juspay.godel/v1-acs.jsa";
    public static final Boolean ADD_MANDATE_PARAMS;
    public static final String AMOUNT = "amount";
    public static final String ASSET_AAR_VERSION = "asset_aar_version";
    public static final String ATTR_HASH_IN_DISK = "hashInDisk";
    public static final String BANK = "bank";
    public static final String BETA_ASSETS = "betaAssets";
    public static final String BLOCKED_WALLETS = "udf_disabled_methods";
    public static final String BUILD_ID = "jp_hyper_build_id";
    public static final String CLIENT_AUTH_TOKEN = "session_token";
    public static final String CLIENT_EMAIL = "customer_email";
    public static final String CLIENT_ID = "client_id";
    public static final String CLIENT_ID_CAMEL = "clientId";
    public static final String CLIENT_MOBILE_NO = "customer_phone_number";
    public static final String CUSTOMER_EMAIL = "customer_email";
    public static final String CUSTOMER_ID = "customer_id";
    public static final String CUSTOMER_MOBILE = "customer_phone_number";
    public static final String DELIVER_SMS = "DELIVER_SMS";
    public static final String DESCRIPTION = "display_note";
    public static final String END_URLS = "endUrls";
    public static final String ENV = "environment";
    public static final String FRAGMENT_VIEW_GROUPS = "fragmentViewGroups";
    public static final String GODEL = "GODEL";
    public static final String GODEL_BUILD_VERSION = "godel_build_version";
    public static final String GODEL_VERSION = "godel_version";
    public static final Boolean IS_SIGNATURE_BASED;
    public static final String ITEM_COUNT = "itemCount";
    public static final String JP_BLOCKED_HASH = "jp_blocked_hash";
    public static final String JP_HASH_AND_STATUS = "jp_hash_and_status";
    public static final String LOG_VERSION = "2.0.1";
    public static final String MCC = "mcc";
    public static final String MERCHANT_ID = "merchant_id";
    public static final String MERCHANT_ID_CAMEL = "merchantId";
    public static final String MERCHANT_KEY_ID = "merchant_key_id";
    public static final String NETWORK_STATUS = "NETWORK_STATUS";
    public static final String OFFER_APPLIED = "offer_applied";
    public static final String OFFER_CODE = "offer_code";
    public static final String OFFER_DISCOUNT = "offer_discount";
    public static final String OFFER_PAYMENT_CARD_ISSUER = "offer_payment_card_issuer";
    public static final String OFFER_PAYMENT_CARD_TYPE = "offer_payment_card_type";
    public static final String OFFER_PAYMENT_METHOD = "offer_payment_method";
    public static final String OFFER_PAYMENT_METHOD_TYPE = "offer_payment_method_type";
    public static final String ORDER_DETAILS_CAMEL = "orderDetails";
    public static final String ORDER_ID = "order_id";
    public static final String ORDER_ID_CAMEL = "orderId";
    public static final String PAYLOAD = "payload";
    public static final String PAYMENT_PAGE_TITLE = "udf_title";
    public static final String POST_DATA = "postData";
    public static final String PROJECT_ID = "project_id";
    public static final String REQUEST_PERMISSION_PREFIX = "ReqPermi";
    public static final int REQUEST_SMS_PERMISSION = 7;
    public static final String SDK_CONFIG = "sdk_meta";
    public static final String SDK_NAME = "sdkName";
    public static final String SDK_VERSION = "sdkVersion";
    public static final String SEND_SMS = "SEND_SMS";
    public static final String SERVICE = "service";
    public static final String SIGNATURE = "signature";
    public static final String SIGNATURE_PAYLOAD = "signature_payload";
    public static final String SIGNATURE_PAYLOAD_CAMEL = "signaturePayload";
    public static final String SMS_CONSENT = "SMS_CONSENT";
    public static final String SMS_RECEIVE = "SMS_RECEIVE";
    public static final String SMS_RETRIEVER = "SMS_RETRIEVER";
    public static final String TIMESTAMP = "timestamp";
    public static final String UDF5 = "udf5";
    public static final String URL = "url";
    public static final String VIES_PAY = "VIES_PAY";
    public static final String WIDGET_ADD_CARD = "addCard";
    public static final String WIDGET_ADD_WALLETS = "addAndLinkWallet";
    public static final String WIDGET_DELINK_WALLET = "delinkWallet";
    public static final String WIDGET_NAME = "widget_key";
    public static final String WIDGET_NETBANKING = "nb";
    public static final String WIDGET_PAYMENT_PAGE = "paymentPage";
    public static final String WIDGET_UPI = "upi";

    static {
        IS_SIGNATURE_BASED = Boolean.TRUE;
        ADD_MANDATE_PARAMS = Boolean.FALSE;
    }
}

