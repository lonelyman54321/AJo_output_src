/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.net.TrafficStats
 *  android.text.TextUtils
 *  android.util.JsonReader
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.firebase.installations.remote;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.FirebaseInstallationsException$Status;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.InstallationResponse$Builder;
import com.google.firebase.installations.remote.InstallationResponse$ResponseCode;
import com.google.firebase.installations.remote.RequestLimiter;
import com.google.firebase.installations.remote.TokenResult;
import com.google.firebase.installations.remote.TokenResult$Builder;
import com.google.firebase.installations.remote.TokenResult$ResponseCode;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

public class FirebaseInstallationServiceClient {
    private static final String ACCEPT_HEADER_KEY = "Accept";
    private static final String API_KEY_HEADER = "x-goog-api-key";
    private static final String CACHE_CONTROL_DIRECTIVE = "no-cache";
    private static final String CACHE_CONTROL_HEADER_KEY = "Cache-Control";
    private static final String CONTENT_ENCODING_HEADER_KEY = "Content-Encoding";
    private static final String CONTENT_TYPE_HEADER_KEY = "Content-Type";
    private static final String CREATE_REQUEST_RESOURCE_NAME_FORMAT = "projects/%s/installations";
    private static final String DELETE_REQUEST_RESOURCE_NAME_FORMAT = "projects/%s/installations/%s";
    private static final Pattern EXPIRATION_TIMESTAMP_PATTERN = Pattern.compile("[0-9]+s");
    private static final String FIREBASE_INSTALLATIONS_API_DOMAIN = "firebaseinstallations.googleapis.com";
    private static final String FIREBASE_INSTALLATIONS_API_VERSION = "v1";
    private static final String FIREBASE_INSTALLATIONS_ID_HEARTBEAT_TAG = "fire-installations-id";
    private static final String FIREBASE_INSTALLATION_AUTH_VERSION = "FIS_v2";
    private static final String FIS_TAG = "Firebase-Installations";
    private static final String GENERATE_AUTH_TOKEN_REQUEST_RESOURCE_NAME_FORMAT = "projects/%s/installations/%s/authTokens:generate";
    private static final String GZIP_CONTENT_ENCODING = "gzip";
    private static final String HEART_BEAT_HEADER = "x-firebase-client";
    private static final String JSON_CONTENT_TYPE = "application/json";
    private static final int MAX_RETRIES = 1;
    private static final int NETWORK_TIMEOUT_MILLIS = 10000;
    static final String PARSING_EXPIRATION_TIME_ERROR_MESSAGE = "Invalid Expiration Timestamp.";
    private static final String SDK_VERSION_PREFIX = "a:";
    private static final int TRAFFIC_STATS_CREATE_INSTALLATION_TAG = 32769;
    private static final int TRAFFIC_STATS_DELETE_INSTALLATION_TAG = 32770;
    private static final int TRAFFIC_STATS_FIREBASE_INSTALLATIONS_TAG = 32768;
    private static final int TRAFFIC_STATS_GENERATE_AUTH_TOKEN_TAG = 32771;
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final String X_ANDROID_CERT_HEADER_KEY = "X-Android-Cert";
    private static final String X_ANDROID_IID_MIGRATION_KEY = "x-goog-fis-android-iid-migration-auth";
    private static final String X_ANDROID_PACKAGE_HEADER_KEY = "X-Android-Package";
    private final Context context;
    private final Provider heartBeatProvider;
    private final RequestLimiter requestLimiter;
    private boolean shouldServerErrorRetry;

    public FirebaseInstallationServiceClient(Context object, Provider provider) {
        this.context = object;
        this.heartBeatProvider = provider;
        this.requestLimiter = object;
    }

    private static String availableFirebaseOptions(String string2, String string3, String string4) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        String string5 = ", ";
        string2 = bl2 ? "" : kp1_0.c(string5, string2);
        return uc0_0.a("Firebase options used while communicating with Firebase server APIs: ", string3, string5, string4, string2);
    }

    private static JSONObject buildCreateFirebaseInstallationRequestBody(String string2, String object) {
        String string3;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            string3 = "fid";
        }
        catch (JSONException jSONException) {
            object = new IllegalStateException(jSONException);
            throw object;
        }
        jSONObject.put(string3, (Object)string2);
        string2 = "appId";
        jSONObject.put(string2, object);
        string2 = "authVersion";
        object = FIREBASE_INSTALLATION_AUTH_VERSION;
        jSONObject.put(string2, object);
        string2 = "sdkVersion";
        object = "a:18.0.0";
        jSONObject.put(string2, object);
        return jSONObject;
    }

    private static JSONObject buildGenerateAuthTokenRequestBody() {
        String string2;
        Object object;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            object = "sdkVersion";
            string2 = "a:18.0.0";
        }
        catch (JSONException jSONException) {
            object = new IllegalStateException(jSONException);
            throw object;
        }
        jSONObject.put((String)object, (Object)string2);
        object = new JSONObject();
        string2 = "installation";
        object.put(string2, (Object)jSONObject);
        return object;
    }

    private String getFingerprintHashForPackage() {
        String string2;
        Object object;
        block7: {
            try {
                object = this.context;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                this.context.getPackageName();
                return null;
            }
            string2 = object.getPackageName();
            object = AndroidUtilsLight.getPackageCertificateHashBytes(object, string2);
            if (object != null) break block7;
            object = this.context;
            object.getPackageName();
            return null;
        }
        string2 = null;
        return Hex.bytesToStringUppercase((byte[])object, false);
    }

    private URL getFullyQualifiedRequestUri(String string2) {
        Object object;
        StringBuilder stringBuilder;
        Object object2 = "https://firebaseinstallations.googleapis.com/v1/";
        try {
            stringBuilder = new StringBuilder((String)object2);
        }
        catch (MalformedURLException malformedURLException) {
            String string3 = malformedURLException.getMessage();
            object = FirebaseInstallationsException$Status.UNAVAILABLE;
            object2 = new FirebaseInstallationsException(string3, (FirebaseInstallationsException$Status)((Object)object));
            throw object2;
        }
        stringBuilder.append(string2);
        string2 = stringBuilder.toString();
        object = new URL(string2);
        return object;
    }

    private static byte[] getJsonBytes(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static boolean isSuccessfulResponseCode(int n3) {
        int n4 = 200;
        n3 = n3 >= n4 && n3 < (n4 = 300) ? 1 : 0;
        return n3 != 0;
    }

    private static void logBadConfigError() {
    }

    private static void logFisCommunicationError(HttpURLConnection object, String string2, String string3, String string4) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)(object = FirebaseInstallationServiceClient.readErrorResponse((HttpURLConnection)object)));
        if (!bl2) {
            FirebaseInstallationServiceClient.availableFirebaseOptions(string2, string3, string4);
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private HttpURLConnection openHttpURLConnection(URL object, String string2) {
        String string3;
        block6: {
            try {
                object = ((URL)object).openConnection();
                object = (HttpURLConnection)object;
                int n3 = 10000;
                ((URLConnection)object).setConnectTimeout(n3);
                ((URLConnection)object).setUseCaches(false);
                ((URLConnection)object).setReadTimeout(n3);
                string3 = JSON_CONTENT_TYPE;
                ((URLConnection)object).addRequestProperty(CONTENT_TYPE_HEADER_KEY, string3);
                ((URLConnection)object).addRequestProperty(ACCEPT_HEADER_KEY, string3);
                ((URLConnection)object).addRequestProperty(CONTENT_ENCODING_HEADER_KEY, GZIP_CONTENT_ENCODING);
                ((URLConnection)object).addRequestProperty(CACHE_CONTROL_HEADER_KEY, CACHE_CONTROL_DIRECTIVE);
            }
            catch (IOException iOException) {
                FirebaseInstallationsException$Status firebaseInstallationsException$Status = FirebaseInstallationsException$Status.UNAVAILABLE;
                object = new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", firebaseInstallationsException$Status);
                throw object;
            }
            Object object2 = this.context.getPackageName();
            string3 = X_ANDROID_PACKAGE_HEADER_KEY;
            ((URLConnection)object).addRequestProperty(string3, (String)object2);
            object2 = (HeartBeatController)this.heartBeatProvider.get();
            if (object2 != null) {
                string3 = HEART_BEAT_HEADER;
                try {
                    object2 = object2.getHeartBeatsHeader();
                    object2 = Tasks.await((Task)object2);
                    object2 = (String)object2;
                    ((URLConnection)object).addRequestProperty(string3, (String)object2);
                    break block6;
                }
                catch (InterruptedException interruptedException) {
                    object2 = Thread.currentThread();
                    ((Thread)object2).interrupt();
                    break block6;
                }
            }
            break block6;
            catch (ExecutionException executionException) {}
        }
        string3 = this.getFingerprintHashForPackage();
        ((URLConnection)object).addRequestProperty(X_ANDROID_CERT_HEADER_KEY, string3);
        ((URLConnection)object).addRequestProperty(API_KEY_HEADER, string2);
        return object;
    }

    public static long parseTokenExpirationTimestamp(String string2) {
        long l2;
        Matcher matcher = EXPIRATION_TIMESTAMP_PATTERN.matcher(string2);
        int n3 = matcher.matches();
        String string3 = PARSING_EXPIRATION_TIME_ERROR_MESSAGE;
        Preconditions.checkArgument(n3 != 0, string3);
        if (string2 != null && (n3 = string2.length()) != 0) {
            n3 = string2.length() + -1;
            string3 = null;
            string2 = string2.substring(0, n3);
            l2 = Long.parseLong(string2);
        } else {
            l2 = 0L;
        }
        return l2;
    }

    private InstallationResponse readCreateResponse(HttpURLConnection object) {
        boolean bl2;
        object = ((URLConnection)object).getInputStream();
        Object object2 = UTF_8;
        Object object3 = new InputStreamReader((InputStream)object, (Charset)object2);
        JsonReader jsonReader = new JsonReader((Reader)object3);
        object3 = TokenResult.builder();
        object2 = InstallationResponse.builder();
        jsonReader.beginObject();
        while (bl2 = jsonReader.hasNext()) {
            String string2;
            Object object4 = jsonReader.nextName();
            boolean bl3 = ((String)object4).equals(string2 = "name");
            if (bl3) {
                object4 = jsonReader.nextString();
                ((InstallationResponse$Builder)object2).setUri((String)object4);
                continue;
            }
            string2 = "fid";
            bl3 = ((String)object4).equals(string2);
            if (bl3) {
                object4 = jsonReader.nextString();
                ((InstallationResponse$Builder)object2).setFid((String)object4);
                continue;
            }
            string2 = "refreshToken";
            bl3 = ((String)object4).equals(string2);
            if (bl3) {
                object4 = jsonReader.nextString();
                ((InstallationResponse$Builder)object2).setRefreshToken((String)object4);
                continue;
            }
            string2 = "authToken";
            bl2 = ((String)object4).equals(string2);
            if (bl2) {
                jsonReader.beginObject();
                while (bl2 = jsonReader.hasNext()) {
                    object4 = jsonReader.nextName();
                    bl3 = ((String)object4).equals(string2 = "token");
                    if (bl3) {
                        object4 = jsonReader.nextString();
                        ((TokenResult$Builder)object3).setToken((String)object4);
                        continue;
                    }
                    string2 = "expiresIn";
                    bl2 = ((String)object4).equals(string2);
                    if (bl2) {
                        object4 = jsonReader.nextString();
                        long l2 = FirebaseInstallationServiceClient.parseTokenExpirationTimestamp((String)object4);
                        ((TokenResult$Builder)object3).setTokenExpirationTimestamp(l2);
                        continue;
                    }
                    jsonReader.skipValue();
                }
                object4 = ((TokenResult$Builder)object3).build();
                ((InstallationResponse$Builder)object2).setAuthToken((TokenResult)object4);
                jsonReader.endObject();
                continue;
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        jsonReader.close();
        ((InputStream)object).close();
        object = InstallationResponse$ResponseCode.OK;
        return ((InstallationResponse$Builder)object2).setResponseCode((InstallationResponse$ResponseCode)((Object)object)).build();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String readErrorResponse(HttpURLConnection object) {
        Throwable throwable2222222;
        BufferedReader bufferedReader;
        block11: {
            Object object2 = ((HttpURLConnection)object).getErrorStream();
            if (object2 == null) {
                return null;
            }
            Comparable<Charset> comparable = UTF_8;
            Object object3 = new InputStreamReader((InputStream)object2, (Charset)comparable);
            bufferedReader = new BufferedReader((Reader)object3);
            try {
                object2 = new StringBuilder();
                while ((object3 = bufferedReader.readLine()) != null) {
                    ((StringBuilder)object2).append((String)object3);
                    char c2 = '\n';
                    ((StringBuilder)object2).append(c2);
                }
            }
            catch (Throwable throwable2222222) {
                break block11;
            }
            object3 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]";
            int n3 = ((HttpURLConnection)object).getResponseCode();
            comparable = n3;
            object = ((HttpURLConnection)object).getResponseMessage();
            int n4 = 3;
            Object[] objectArray = new Object[n4];
            objectArray[0] = comparable;
            n3 = 1;
            objectArray[n3] = object;
            int n7 = 2;
            objectArray[n7] = object2;
            object = String.format((String)object3, objectArray);
            bufferedReader.close();
            return object;
            {
                catch (IOException iOException) {
                    return object;
                }
            }
        }
        bufferedReader.close();
        {
            catch (IOException iOException) {
                throw throwable2222222;
            }
        }
        throw throwable2222222;
        catch (IOException iOException) {
            try {}
            catch (IOException iOException2) {
                return null;
            }
            bufferedReader.close();
            return null;
        }
    }

    private TokenResult readGenerateAuthTokenResponse(HttpURLConnection object) {
        boolean bl2;
        object = ((URLConnection)object).getInputStream();
        Object object2 = UTF_8;
        Object object3 = new InputStreamReader((InputStream)object, (Charset)object2);
        JsonReader jsonReader = new JsonReader((Reader)object3);
        object3 = TokenResult.builder();
        jsonReader.beginObject();
        while (bl2 = jsonReader.hasNext()) {
            String string2;
            object2 = jsonReader.nextName();
            boolean bl3 = ((String)object2).equals(string2 = "token");
            if (bl3) {
                object2 = jsonReader.nextString();
                ((TokenResult$Builder)object3).setToken((String)object2);
                continue;
            }
            string2 = "expiresIn";
            bl2 = ((String)object2).equals(string2);
            if (bl2) {
                object2 = jsonReader.nextString();
                long l2 = FirebaseInstallationServiceClient.parseTokenExpirationTimestamp((String)object2);
                ((TokenResult$Builder)object3).setTokenExpirationTimestamp(l2);
                continue;
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        jsonReader.close();
        ((InputStream)object).close();
        object = TokenResult$ResponseCode.OK;
        return ((TokenResult$Builder)object3).setResponseCode((TokenResult$ResponseCode)((Object)object)).build();
    }

    private void writeFIDCreateRequestBodyToOutputStream(HttpURLConnection httpURLConnection, String object, String string2) {
        object = FirebaseInstallationServiceClient.getJsonBytes(FirebaseInstallationServiceClient.buildCreateFirebaseInstallationRequestBody((String)object, string2));
        FirebaseInstallationServiceClient.writeRequestBodyToOutputStream(httpURLConnection, (byte[])object);
    }

    private void writeGenerateAuthTokenRequestBodyToOutputStream(HttpURLConnection httpURLConnection) {
        byte[] byArray = FirebaseInstallationServiceClient.getJsonBytes(FirebaseInstallationServiceClient.buildGenerateAuthTokenRequestBody());
        FirebaseInstallationServiceClient.writeRequestBodyToOutputStream(httpURLConnection, byArray);
    }

    private static void writeRequestBodyToOutputStream(URLConnection object, byte[] byArray) {
        GZIPOutputStream gZIPOutputStream;
        if ((object = ((URLConnection)object).getOutputStream()) != null) {
            gZIPOutputStream = new GZIPOutputStream((OutputStream)object);
            ((OutputStream)gZIPOutputStream).write(byArray);
            return;
        }
        object = new IOException("Cannot send request to FIS servers. No OutputStream available.");
        throw object;
        finally {
            ((OutputStream)gZIPOutputStream).close();
            ((OutputStream)object).close();
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public InstallationResponse createFirebaseInstallation(String object, String object2, String string2, String string3, String string4) {
        Object object3 = this.requestLimiter;
        boolean bl2 = ((RequestLimiter)object3).isRequestAllowed();
        String string5 = "Firebase Installations Service is unavailable. Please try again later.";
        if (!bl2) {
            object2 /* !! */  = FirebaseInstallationsException$Status.UNAVAILABLE;
            object = new FirebaseInstallationsException(string5, (FirebaseInstallationsException$Status)((Object)object2 /* !! */ ));
            throw object;
        }
        object3 = cP.a("projects/", string2, "/installations");
        object3 = this.getFullyQualifiedRequestUri((String)object3);
        int n3 = 0;
        while (true) {
            HttpURLConnection httpURLConnection;
            block12: {
                Throwable throwable222;
                block13: {
                    Object object4;
                    Object object5;
                    block11: {
                        block10: {
                            int n4;
                            if (n3 > (n4 = 1)) {
                                object2 /* !! */  = FirebaseInstallationsException$Status.UNAVAILABLE;
                                object = new FirebaseInstallationsException(string5, (FirebaseInstallationsException$Status)((Object)object2 /* !! */ ));
                                throw object;
                            }
                            int n7 = 32769;
                            TrafficStats.setThreadStatsTag((int)n7);
                            httpURLConnection = this.openHttpURLConnection((URL)object3, (String)object);
                            object5 = "POST";
                            try {
                                httpURLConnection.setRequestMethod((String)object5);
                                httpURLConnection.setDoOutput(n4 != 0);
                                if (string4 != null) {
                                    object4 = X_ANDROID_IID_MIGRATION_KEY;
                                    httpURLConnection.addRequestProperty((String)object4, string4);
                                }
                                this.writeFIDCreateRequestBodyToOutputStream(httpURLConnection, object2 /* !! */ , string3);
                                n4 = httpURLConnection.getResponseCode();
                                object5 = this.requestLimiter;
                                ((RequestLimiter)object5).setNextRequestTime(n4);
                                int n8 = FirebaseInstallationServiceClient.isSuccessfulResponseCode(n4);
                                if (n8 != 0) {
                                    object = this.readCreateResponse(httpURLConnection);
                                    break block10;
                                }
                                FirebaseInstallationServiceClient.logFisCommunicationError(httpURLConnection, string3, (String)object, string2);
                                n8 = 429;
                                if (n4 == n8) break block11;
                                n8 = 500;
                                if (n4 >= n8 && n4 < (n8 = 600)) break block12;
                                FirebaseInstallationServiceClient.logBadConfigError();
                                object4 = InstallationResponse.builder();
                                object5 = InstallationResponse$ResponseCode.BAD_CONFIG;
                                object4 = ((InstallationResponse$Builder)object4).setResponseCode((InstallationResponse$ResponseCode)((Object)object5));
                                object = ((InstallationResponse$Builder)object4).build();
                            }
                            catch (Throwable throwable222) {
                                break block13;
                            }
                        }
                        httpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        return object;
                    }
                    object5 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later.";
                    FirebaseInstallationsException$Status firebaseInstallationsException$Status = FirebaseInstallationsException$Status.TOO_MANY_REQUESTS;
                    object4 = new FirebaseInstallationsException((String)object5, firebaseInstallationsException$Status);
                    throw object4;
                }
                httpURLConnection.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw throwable222;
                catch (IOException | AssertionError object6) {}
            }
            httpURLConnection.disconnect();
            TrafficStats.clearThreadStatsTag();
            ++n3;
        }
    }

    public void deleteFirebaseInstallation(String object, String object2, String object3, String string2) {
        int n3;
        Object object4 = "/installations/";
        object2 = UX.c("projects/", object3, (String)object4, (String)object2);
        object2 = this.getFullyQualifiedRequestUri((String)object2);
        for (int i3 = 0; i3 <= (n3 = 1); ++i3) {
            Throwable throwable2;
            block15: {
                block13: {
                    block14: {
                        n3 = 32770;
                        TrafficStats.setThreadStatsTag((int)n3);
                        object4 = this.openHttpURLConnection((URL)object2, (String)object);
                        Object object5 = "DELETE";
                        ((HttpURLConnection)object4).setRequestMethod((String)object5);
                        object5 = "Authorization";
                        CharSequence charSequence = new StringBuilder();
                        Object object6 = "FIS_v2 ";
                        charSequence.append((String)object6);
                        charSequence.append(string2);
                        charSequence = charSequence.toString();
                        ((URLConnection)object4).addRequestProperty((String)object5, (String)charSequence);
                        int n4 = ((HttpURLConnection)object4).getResponseCode();
                        int n7 = 200;
                        if (n4 == n7 || n4 == (n7 = 401) || n4 == (n7 = 404)) break block13;
                        n7 = 0;
                        charSequence = null;
                        FirebaseInstallationServiceClient.logFisCommunicationError((HttpURLConnection)object4, null, (String)object, object3);
                        n7 = 429;
                        if (n4 == n7 || n4 >= (n7 = 500) && n4 < (n7 = 600)) break block14;
                        FirebaseInstallationServiceClient.logBadConfigError();
                        charSequence = "Bad config while trying to delete FID";
                        object6 = FirebaseInstallationsException$Status.BAD_CONFIG;
                        try {
                            object5 = new FirebaseInstallationsException((String)charSequence, (FirebaseInstallationsException$Status)((Object)object6));
                            throw object5;
                        }
                        catch (Throwable throwable2) {
                            break block15;
                        }
                        catch (IOException iOException) {}
                    }
                    ((HttpURLConnection)object4).disconnect();
                    TrafficStats.clearThreadStatsTag();
                    continue;
                }
                ((HttpURLConnection)object4).disconnect();
                TrafficStats.clearThreadStatsTag();
                return;
            }
            ((HttpURLConnection)object4).disconnect();
            TrafficStats.clearThreadStatsTag();
            throw throwable2;
        }
        object3 = FirebaseInstallationsException$Status.UNAVAILABLE;
        object = new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", (FirebaseInstallationsException$Status)((Object)object3));
        throw object;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public TokenResult generateAuthToken(String object, String object2, String string2, String string3) {
        RequestLimiter requestLimiter = this.requestLimiter;
        int n3 = requestLimiter.isRequestAllowed();
        String string4 = "Firebase Installations Service is unavailable. Please try again later.";
        if (n3 == 0) {
            object2 /* !! */  = FirebaseInstallationsException$Status.UNAVAILABLE;
            object = new FirebaseInstallationsException(string4, (FirebaseInstallationsException$Status)((Object)object2 /* !! */ ));
            throw object;
        }
        Object object3 = "/installations/";
        Object object4 = "/authTokens:generate";
        object2 /* !! */  = uc0_0.a("projects/", string2, (String)object3, object2 /* !! */ , (String)object4);
        object2 /* !! */  = this.getFullyQualifiedRequestUri(object2 /* !! */ );
        n3 = 0;
        requestLimiter = null;
        while (true) {
            block12: {
                Throwable throwable222;
                block13: {
                    block9: {
                        Object object5;
                        block10: {
                            Object object6;
                            block11: {
                                int n4;
                                if (n3 > (n4 = 1)) {
                                    object2 /* !! */  = FirebaseInstallationsException$Status.UNAVAILABLE;
                                    object = new FirebaseInstallationsException(string4, (FirebaseInstallationsException$Status)((Object)object2 /* !! */ ));
                                    throw object;
                                }
                                int n7 = 32771;
                                TrafficStats.setThreadStatsTag((int)n7);
                                object4 = this.openHttpURLConnection((URL)object2 /* !! */ , (String)object);
                                object5 = "POST";
                                ((HttpURLConnection)object4).setRequestMethod((String)object5);
                                object5 = "Authorization";
                                object6 = new StringBuilder();
                                String string5 = "FIS_v2 ";
                                object6.append(string5);
                                object6.append(string3);
                                object6 = object6.toString();
                                ((URLConnection)object4).addRequestProperty((String)object5, (String)object6);
                                ((URLConnection)object4).setDoOutput(n4 != 0);
                                this.writeGenerateAuthTokenRequestBodyToOutputStream((HttpURLConnection)object4);
                                n4 = ((HttpURLConnection)object4).getResponseCode();
                                object5 = this.requestLimiter;
                                ((RequestLimiter)object5).setNextRequestTime(n4);
                                int n8 = FirebaseInstallationServiceClient.isSuccessfulResponseCode(n4);
                                if (n8 != 0) {
                                    object = this.readGenerateAuthTokenResponse((HttpURLConnection)object4);
                                    break block9;
                                }
                                n8 = 0;
                                object5 = null;
                                FirebaseInstallationServiceClient.logFisCommunicationError((HttpURLConnection)object4, null, (String)object, string2);
                                n8 = 401;
                                if (n4 == n8 || n4 == (n8 = 404)) break block10;
                                n8 = 429;
                                if (n4 == n8) break block11;
                                n8 = 500;
                                if (n4 >= n8 && n4 < (n8 = 600)) break block12;
                                try {
                                    FirebaseInstallationServiceClient.logBadConfigError();
                                    object3 = TokenResult.builder();
                                    object5 = TokenResult$ResponseCode.BAD_CONFIG;
                                    object3 = ((TokenResult$Builder)object3).setResponseCode((TokenResult$ResponseCode)((Object)object5));
                                    object = ((TokenResult$Builder)object3).build();
                                    break block9;
                                }
                                catch (Throwable throwable222) {
                                    break block13;
                                }
                            }
                            object5 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later.";
                            object6 = FirebaseInstallationsException$Status.TOO_MANY_REQUESTS;
                            object3 = new FirebaseInstallationsException((String)object5, (FirebaseInstallationsException$Status)((Object)object6));
                            throw object3;
                        }
                        object3 = TokenResult.builder();
                        object5 = TokenResult$ResponseCode.AUTH_ERROR;
                        object3 = ((TokenResult$Builder)object3).setResponseCode((TokenResult$ResponseCode)((Object)object5));
                        object = ((TokenResult$Builder)object3).build();
                    }
                    ((HttpURLConnection)object4).disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return object;
                }
                ((HttpURLConnection)object4).disconnect();
                TrafficStats.clearThreadStatsTag();
                throw throwable222;
                catch (IOException | AssertionError object7) {}
            }
            ((HttpURLConnection)object4).disconnect();
            TrafficStats.clearThreadStatsTag();
            ++n3;
        }
    }
}

