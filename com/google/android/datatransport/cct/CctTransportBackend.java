/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.telephony.TelephonyManager
 */
package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.cct.CctTransportBackend$HttpRequest;
import com.google.android.datatransport.cct.CctTransportBackend$HttpResponse;
import com.google.android.datatransport.cct.a;
import com.google.android.datatransport.cct.internal.AndroidClientInfo;
import com.google.android.datatransport.cct.internal.AndroidClientInfo$Builder;
import com.google.android.datatransport.cct.internal.BatchedLogRequest;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.ClientInfo$Builder;
import com.google.android.datatransport.cct.internal.ClientInfo$ClientType;
import com.google.android.datatransport.cct.internal.ComplianceData;
import com.google.android.datatransport.cct.internal.ComplianceData$Builder;
import com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin;
import com.google.android.datatransport.cct.internal.ExperimentIds;
import com.google.android.datatransport.cct.internal.ExperimentIds$Builder;
import com.google.android.datatransport.cct.internal.ExternalPRequestContext;
import com.google.android.datatransport.cct.internal.ExternalPRequestContext$Builder;
import com.google.android.datatransport.cct.internal.ExternalPrivacyContext;
import com.google.android.datatransport.cct.internal.ExternalPrivacyContext$Builder;
import com.google.android.datatransport.cct.internal.LogEvent;
import com.google.android.datatransport.cct.internal.LogEvent$Builder;
import com.google.android.datatransport.cct.internal.LogRequest;
import com.google.android.datatransport.cct.internal.LogRequest$Builder;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo$Builder;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.EventInternal$Builder;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.retries.Function;
import com.google.android.datatransport.runtime.retries.Retries;
import com.google.android.datatransport.runtime.retries.RetryStrategy;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.firebase.encoders.DataEncoder;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;

final class CctTransportBackend
implements TransportBackend {
    private static final String ACCEPT_ENCODING_HEADER_KEY = "Accept-Encoding";
    static final String API_KEY_HEADER_KEY = "X-Goog-Api-Key";
    private static final int CONNECTION_TIME_OUT = 30000;
    private static final String CONTENT_ENCODING_HEADER_KEY = "Content-Encoding";
    private static final String CONTENT_TYPE_HEADER_KEY = "Content-Type";
    private static final String GZIP_CONTENT_ENCODING = "gzip";
    private static final int INVALID_VERSION_CODE = 255;
    private static final String JSON_CONTENT_TYPE = "application/json";
    private static final String KEY_APPLICATION_BUILD = "application_build";
    private static final String KEY_COUNTRY = "country";
    private static final String KEY_DEVICE = "device";
    private static final String KEY_FINGERPRINT = "fingerprint";
    private static final String KEY_HARDWARE = "hardware";
    private static final String KEY_LOCALE = "locale";
    private static final String KEY_MANUFACTURER = "manufacturer";
    private static final String KEY_MCC_MNC = "mcc_mnc";
    static final String KEY_MOBILE_SUBTYPE = "mobile-subtype";
    private static final String KEY_MODEL = "model";
    static final String KEY_NETWORK_TYPE = "net-type";
    private static final String KEY_OS_BUILD = "os-uild";
    private static final String KEY_PRODUCT = "product";
    private static final String KEY_SDK_VERSION = "sdk-version";
    private static final String KEY_TIMEZONE_OFFSET = "tz-offset";
    private static final String LOG_TAG = "CctTransportBackend";
    private static final int READ_TIME_OUT = 130000;
    private final Context applicationContext;
    private final ConnectivityManager connectivityManager;
    private final DataEncoder dataEncoder;
    final URL endPoint;
    private final int readTimeout;
    private final Clock uptimeClock;
    private final Clock wallTimeClock;

    public CctTransportBackend(Context context, Clock clock, Clock clock2) {
        this(context, clock, clock2, 130000);
    }

    public CctTransportBackend(Context object, Clock clock, Clock clock2, int n3) {
        DataEncoder dataEncoder;
        this.dataEncoder = dataEncoder = BatchedLogRequest.createDataEncoder();
        this.applicationContext = object;
        object = (ConnectivityManager)object.getSystemService("connectivity");
        this.connectivityManager = object;
        object = CctTransportBackend.parseUrlOrThrow(CCTDestination.DEFAULT_END_POINT);
        this.endPoint = object;
        this.uptimeClock = clock2;
        this.wallTimeClock = clock;
        this.readTimeout = n3;
    }

    public static /* synthetic */ CctTransportBackend$HttpResponse a(CctTransportBackend cctTransportBackend, CctTransportBackend$HttpRequest cctTransportBackend$HttpRequest) {
        return cctTransportBackend.doSend(cctTransportBackend$HttpRequest);
    }

    public static /* synthetic */ CctTransportBackend$HttpRequest b(CctTransportBackend$HttpRequest cctTransportBackend$HttpRequest, CctTransportBackend$HttpResponse cctTransportBackend$HttpResponse) {
        return CctTransportBackend.lambda$send$0(cctTransportBackend$HttpRequest, cctTransportBackend$HttpResponse);
    }

    /*
     * Exception decompiling
     */
    private CctTransportBackend$HttpResponse doSend(CctTransportBackend$HttpRequest var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 23[TRYBLOCK] [30 : 473->479)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static String getMccMncOrEmpty(Context object) {
        if ((object = CctTransportBackend.getTelephonyManager(object).getSimOperator()) != null) {
            return object;
        }
        return "";
    }

    private static int getNetSubtypeValue(NetworkInfo networkInfo) {
        int n3;
        if (networkInfo == null) {
            return NetworkConnectionInfo$MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.getValue();
        }
        int n4 = networkInfo.getSubtype();
        if (n4 == (n3 = -1)) {
            return NetworkConnectionInfo$MobileSubtype.COMBINED.getValue();
        }
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype = NetworkConnectionInfo$MobileSubtype.forNumber(n4);
        if (networkConnectionInfo$MobileSubtype == null) {
            n4 = 0;
            networkInfo = null;
        }
        return n4;
    }

    private static int getNetTypeValue(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return NetworkConnectionInfo$NetworkType.NONE.getValue();
        }
        return networkInfo.getType();
    }

    private static int getPackageVersionCode(Context object) {
        PackageManager packageManager;
        try {
            packageManager = object.getPackageManager();
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            Logging.e(LOG_TAG, "Unable to find version code for package", nameNotFoundException);
            return -1;
        }
        object = object.getPackageName();
        object = packageManager.getPackageInfo((String)object, 0);
        return object.versionCode;
    }

    private BatchedLogRequest getRequestBody(BackendRequest arrayList) {
        ArrayList<Object> arrayList2;
        Object object;
        Object object2;
        boolean bl2;
        Object object3 = new HashMap();
        arrayList = ((BackendRequest)((Object)arrayList)).getEvents().iterator();
        while (bl2 = arrayList.hasNext()) {
            object2 = (EventInternal)arrayList.next();
            object = ((EventInternal)object2).getTransportName();
            boolean n3 = ((HashMap)object3).containsKey(object);
            if (!n3) {
                arrayList2 = new ArrayList<Object>();
                arrayList2.add(object2);
                ((HashMap)object3).put(object, arrayList2);
                continue;
            }
            object = (List)((HashMap)object3).get(object);
            object.add(object2);
        }
        arrayList = new ArrayList<Object>();
        object3 = ((HashMap)object3).entrySet().iterator();
        while (bl2 = object3.hasNext()) {
            boolean bl3;
            object2 = (Map.Entry)object3.next();
            object = (List)object2.getValue();
            int n3 = 0;
            object = (EventInternal)object.get(0);
            arrayList2 = LogRequest.builder();
            Object object4 = QosTier.DEFAULT;
            arrayList2 = ((LogRequest$Builder)((Object)arrayList2)).setQosTier((QosTier)((Object)object4));
            long l2 = this.wallTimeClock.getTime();
            arrayList2 = ((LogRequest$Builder)((Object)arrayList2)).setRequestTimeMs(l2);
            l2 = this.uptimeClock.getTime();
            arrayList2 = ((LogRequest$Builder)((Object)arrayList2)).setRequestUptimeMs(l2);
            object4 = ClientInfo.builder();
            Object object5 = ClientInfo$ClientType.ANDROID_FIREBASE;
            object4 = ((ClientInfo$Builder)object4).setClientType((ClientInfo$ClientType)((Object)object5));
            object5 = AndroidClientInfo.builder();
            int n4 = ((EventInternal)object).getInteger(KEY_SDK_VERSION);
            Object object6 = n4;
            object5 = ((AndroidClientInfo$Builder)object5).setSdkVersion((Integer)object6);
            object6 = ((EventInternal)object).get(KEY_MODEL);
            object5 = ((AndroidClientInfo$Builder)object5).setModel((String)object6);
            object6 = ((EventInternal)object).get(KEY_HARDWARE);
            object5 = ((AndroidClientInfo$Builder)object5).setHardware((String)object6);
            object6 = ((EventInternal)object).get(KEY_DEVICE);
            object5 = ((AndroidClientInfo$Builder)object5).setDevice((String)object6);
            object6 = ((EventInternal)object).get(KEY_PRODUCT);
            object5 = ((AndroidClientInfo$Builder)object5).setProduct((String)object6);
            object6 = ((EventInternal)object).get(KEY_OS_BUILD);
            object5 = ((AndroidClientInfo$Builder)object5).setOsBuild((String)object6);
            object6 = ((EventInternal)object).get(KEY_MANUFACTURER);
            object5 = ((AndroidClientInfo$Builder)object5).setManufacturer((String)object6);
            object6 = ((EventInternal)object).get(KEY_FINGERPRINT);
            object5 = ((AndroidClientInfo$Builder)object5).setFingerprint((String)object6);
            object6 = ((EventInternal)object).get(KEY_COUNTRY);
            object5 = ((AndroidClientInfo$Builder)object5).setCountry((String)object6);
            object6 = ((EventInternal)object).get(KEY_LOCALE);
            object5 = ((AndroidClientInfo$Builder)object5).setLocale((String)object6);
            object6 = ((EventInternal)object).get(KEY_MCC_MNC);
            object5 = ((AndroidClientInfo$Builder)object5).setMccMnc((String)object6);
            object6 = KEY_APPLICATION_BUILD;
            object = ((EventInternal)object).get((String)object6);
            object = ((AndroidClientInfo$Builder)object5).setApplicationBuild((String)object).build();
            object = ((ClientInfo$Builder)object4).setAndroidClientInfo((AndroidClientInfo)object).build();
            object = ((LogRequest$Builder)((Object)arrayList2)).setClientInfo((ClientInfo)object);
            arrayList2 = object2.getKey();
            arrayList2 = (String)((Object)arrayList2);
            n3 = Integer.parseInt((String)((Object)arrayList2));
            try {
                ((LogRequest$Builder)object).setSource(n3);
            }
            catch (NumberFormatException numberFormatException) {
                arrayList2 = (String)object2.getKey();
                ((LogRequest$Builder)object).setSource((String)((Object)arrayList2));
            }
            arrayList2 = new ArrayList<Object>();
            object2 = ((List)object2.getValue()).iterator();
            while (bl3 = object2.hasNext()) {
                block19: {
                    Object object7;
                    block18: {
                        boolean bl4;
                        block17: {
                            object4 = (EventInternal)object2.next();
                            object5 = ((EventInternal)object4).getEncodedPayload();
                            object6 = ((EncodedPayload)object5).getEncoding();
                            bl4 = ((Encoding)object6).equals(object7 = Encoding.of("proto"));
                            if (!bl4) break block17;
                            object5 = LogEvent.protoBuilder(((EncodedPayload)object5).getBytes());
                            break block18;
                        }
                        object7 = Encoding.of("json");
                        bl4 = ((Encoding)object6).equals(object7);
                        if (!bl4) break block19;
                        object5 = ((EncodedPayload)object5).getBytes();
                        object7 = Charset.forName("UTF-8");
                        object6 = new String((byte[])object5, (Charset)object7);
                        object5 = LogEvent.jsonBuilder((String)object6);
                    }
                    long l3 = ((EventInternal)object4).getEventMillis();
                    object6 = ((LogEvent$Builder)object5).setEventTimeMs(l3);
                    long l4 = ((EventInternal)object4).getUptimeMillis();
                    object6 = ((LogEvent$Builder)object6).setEventUptimeMs(l4);
                    l4 = ((EventInternal)object4).getLong(KEY_TIMEZONE_OFFSET);
                    object6 = ((LogEvent$Builder)object6).setTimezoneOffsetSeconds(l4);
                    object7 = NetworkConnectionInfo.builder();
                    Object object8 = NetworkConnectionInfo$NetworkType.forNumber(((EventInternal)object4).getInteger(KEY_NETWORK_TYPE));
                    object7 = ((NetworkConnectionInfo$Builder)object7).setNetworkType((NetworkConnectionInfo$NetworkType)((Object)object8));
                    int n7 = ((EventInternal)object4).getInteger(KEY_MOBILE_SUBTYPE);
                    object8 = NetworkConnectionInfo$MobileSubtype.forNumber(n7);
                    object7 = ((NetworkConnectionInfo$Builder)object7).setMobileSubtype((NetworkConnectionInfo$MobileSubtype)((Object)object8)).build();
                    ((LogEvent$Builder)object6).setNetworkConnectionInfo((NetworkConnectionInfo)object7);
                    object6 = ((EventInternal)object4).getCode();
                    if (object6 != null) {
                        object6 = ((EventInternal)object4).getCode();
                        ((LogEvent$Builder)object5).setEventCode((Integer)object6);
                    }
                    if ((object6 = ((EventInternal)object4).getProductId()) != null) {
                        object6 = ComplianceData.builder();
                        object7 = ExternalPrivacyContext.builder();
                        object8 = ExternalPRequestContext.builder();
                        Integer n8 = ((EventInternal)object4).getProductId();
                        object8 = ((ExternalPRequestContext$Builder)object8).setOriginAssociatedProductId(n8).build();
                        object7 = ((ExternalPrivacyContext$Builder)object7).setPrequest((ExternalPRequestContext)object8).build();
                        object6 = ((ComplianceData$Builder)object6).setPrivacyContext((ExternalPrivacyContext)object7);
                        object7 = ComplianceData$ProductIdOrigin.EVENT_OVERRIDE;
                        object6 = ((ComplianceData$Builder)object6).setProductIdOrigin((ComplianceData$ProductIdOrigin)((Object)object7)).build();
                        ((LogEvent$Builder)object5).setComplianceData((ComplianceData)object6);
                    }
                    if ((object6 = (Object)((EventInternal)object4).getExperimentIdsClear()) != null || (object6 = (Object)((EventInternal)object4).getExperimentIdsEncrypted()) != null) {
                        object6 = ExperimentIds.builder();
                        object7 = ((EventInternal)object4).getExperimentIdsClear();
                        if (object7 != null) {
                            object7 = ((EventInternal)object4).getExperimentIdsClear();
                            ((ExperimentIds$Builder)object6).setClearBlob((byte[])object7);
                        }
                        if ((object7 = (Object)((EventInternal)object4).getExperimentIdsEncrypted()) != null) {
                            object4 = ((EventInternal)object4).getExperimentIdsEncrypted();
                            ((ExperimentIds$Builder)object6).setEncryptedBlob((byte[])object4);
                        }
                        object4 = ((ExperimentIds$Builder)object6).build();
                        ((LogEvent$Builder)object5).setExperimentIds((ExperimentIds)object4);
                    }
                    object4 = ((LogEvent$Builder)object5).build();
                    arrayList2.add(object4);
                    continue;
                }
                object4 = LOG_TAG;
                object5 = "Received event of unsupported encoding %s. Skipping...";
                Logging.w((String)object4, (String)object5, object6);
            }
            ((LogRequest$Builder)object).setLogEvents(arrayList2);
            object2 = ((LogRequest$Builder)object).build();
            arrayList.add(object2);
        }
        return BatchedLogRequest.create(arrayList);
    }

    private static TelephonyManager getTelephonyManager(Context context) {
        return (TelephonyManager)context.getSystemService("phone");
    }

    public static long getTzOffset() {
        Calendar.getInstance();
        TimeZone timeZone = TimeZone.getDefault();
        long l2 = Calendar.getInstance().getTimeInMillis();
        return timeZone.getOffset(l2) / 1000;
    }

    private static /* synthetic */ CctTransportBackend$HttpRequest lambda$send$0(CctTransportBackend$HttpRequest cctTransportBackend$HttpRequest, CctTransportBackend$HttpResponse object) {
        URL uRL = ((CctTransportBackend$HttpResponse)object).redirectUrl;
        if (uRL != null) {
            Logging.d(LOG_TAG, "Following redirect to: %s", (Object)uRL);
            object = ((CctTransportBackend$HttpResponse)object).redirectUrl;
            return cctTransportBackend$HttpRequest.withUrl((URL)object);
        }
        return null;
    }

    private static InputStream maybeUnGzip(InputStream inputStream, String object) {
        String string2 = GZIP_CONTENT_ENCODING;
        boolean bl2 = string2.equals(object);
        if (bl2) {
            object = new GZIPInputStream(inputStream);
            return object;
        }
        return inputStream;
    }

    private static URL parseUrlOrThrow(String string2) {
        try {
            URL uRL = new URL(string2);
            return uRL;
        }
        catch (MalformedURLException malformedURLException) {
            string2 = kp1_0.c("Invalid url: ", string2);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2, malformedURLException);
            throw illegalArgumentException;
        }
    }

    public EventInternal decorate(EventInternal object) {
        Object object2 = this.connectivityManager.getActiveNetworkInfo();
        object = ((EventInternal)object).toBuilder();
        int n3 = Build.VERSION.SDK_INT;
        object = ((EventInternal$Builder)object).addMetadata(KEY_SDK_VERSION, n3);
        String string2 = Build.MODEL;
        object = ((EventInternal$Builder)object).addMetadata(KEY_MODEL, string2);
        string2 = Build.HARDWARE;
        object = ((EventInternal$Builder)object).addMetadata(KEY_HARDWARE, string2);
        string2 = Build.DEVICE;
        object = ((EventInternal$Builder)object).addMetadata(KEY_DEVICE, string2);
        string2 = Build.PRODUCT;
        object = ((EventInternal$Builder)object).addMetadata(KEY_PRODUCT, string2);
        string2 = Build.ID;
        object = ((EventInternal$Builder)object).addMetadata(KEY_OS_BUILD, string2);
        string2 = Build.MANUFACTURER;
        object = ((EventInternal$Builder)object).addMetadata(KEY_MANUFACTURER, string2);
        string2 = Build.FINGERPRINT;
        object = ((EventInternal$Builder)object).addMetadata(KEY_FINGERPRINT, string2);
        long l2 = CctTransportBackend.getTzOffset();
        object = ((EventInternal$Builder)object).addMetadata(KEY_TIMEZONE_OFFSET, l2);
        n3 = CctTransportBackend.getNetTypeValue(object2);
        object = ((EventInternal$Builder)object).addMetadata(KEY_NETWORK_TYPE, n3);
        int n4 = CctTransportBackend.getNetSubtypeValue(object2);
        object = ((EventInternal$Builder)object).addMetadata(KEY_MOBILE_SUBTYPE, n4);
        object2 = Locale.getDefault().getCountry();
        object = ((EventInternal$Builder)object).addMetadata(KEY_COUNTRY, (String)object2);
        object2 = Locale.getDefault().getLanguage();
        object = ((EventInternal$Builder)object).addMetadata(KEY_LOCALE, (String)object2);
        object2 = CctTransportBackend.getMccMncOrEmpty(this.applicationContext);
        object = ((EventInternal$Builder)object).addMetadata(KEY_MCC_MNC, (String)object2);
        object2 = Integer.toString(CctTransportBackend.getPackageVersionCode(this.applicationContext));
        return ((EventInternal$Builder)object).addMetadata(KEY_APPLICATION_BUILD, (String)object2).build();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public BackendResponse send(BackendRequest object) {
        IOException iOException2;
        block9: {
            int n3;
            Object object2 = this.getRequestBody((BackendRequest)object);
            Object object3 = this.endPoint;
            Object object4 = ((BackendRequest)object).getExtras();
            String string2 = null;
            if (object4 != null) {
                try {
                    object = ((BackendRequest)object).getExtras();
                    object = CCTDestination.fromByteArray((byte[])object);
                    object4 = ((CCTDestination)object).getAPIKey();
                    if (object4 != null) {
                        string2 = ((CCTDestination)object).getAPIKey();
                    }
                    if ((object4 = (Object)((CCTDestination)object).getEndPoint()) != null) {
                        object = ((CCTDestination)object).getEndPoint();
                        object3 = CctTransportBackend.parseUrlOrThrow((String)object);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    return BackendResponse.fatalError();
                }
            }
            try {
                object = new CctTransportBackend$HttpRequest((URL)object3, (BatchedLogRequest)object2, string2);
                object2 = new a(this);
                object3 = new Object();
                int n4 = 5;
                object = Retries.retry(n4, object, (Function)object2, (RetryStrategy)object3);
                object = (CctTransportBackend$HttpResponse)object;
                n3 = ((CctTransportBackend$HttpResponse)object).code;
                int n7 = 200;
                if (n3 == n7) {
                    long l2 = ((CctTransportBackend$HttpResponse)object).nextRequestMillis;
                    return BackendResponse.ok(l2);
                }
            }
            catch (IOException iOException2) {
                break block9;
            }
            int n8 = 500;
            if (n3 >= n8) return BackendResponse.transientError();
            n8 = 404;
            if (n3 == n8) {
                return BackendResponse.transientError();
            }
            n8 = 400;
            if (n3 != n8) return BackendResponse.fatalError();
            return BackendResponse.invalidPayload();
        }
        Logging.e(LOG_TAG, "Could not make request to the backend", iOException2);
        return BackendResponse.transientError();
    }
}

