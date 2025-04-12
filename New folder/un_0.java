/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest$b;
import com.facebook.f;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from Un
 */
public final class un_0
implements GraphRequest$b {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(f object) {
        JSONException jSONException2;
        Object object2;
        Object object3;
        String string2;
        Object object4;
        int n3;
        block14: {
            NullPointerException nullPointerException2;
            block13: {
                int n4 = 2;
                n3 = 1;
                boolean bl2 = false;
                CharSequence charSequence = null;
                object4 = "response";
                Intrinsics.checkNotNullParameter(object, (String)object4);
                vn_0.a.getClass();
                Intrinsics.checkNotNullParameter(object, (String)object4);
                object4 = ((f)object).c;
                string2 = vn_0.b;
                Object object5 = null;
                object3 = "null cannot be cast to non-null type kotlin.String";
                if (object4 != null) {
                    block12: {
                        object4 = sx1.d;
                        object4 = Ax1.APP_EVENTS;
                        Intrinsics.checkNotNull(string2, (String)object3);
                        object = ((f)object).c;
                        object3 = ((FacebookRequestError)object).toString();
                        object = String.valueOf(((FacebookRequestError)object).i);
                        Object object6 = new Object[n4];
                        object6[0] = object3;
                        object6[n3] = object;
                        sx1$a.b((Ax1)((Object)object4), string2, " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", (Object[])object6);
                        object = vn_0.class;
                        boolean bl3 = td0.b(object);
                        if (!bl3) {
                            try {
                                boolean bl4;
                                object3 = FacebookSdk.a();
                                object6 = "com.facebook.sdk.CloudBridgeSavedCredentials";
                                object3 = object3.getSharedPreferences((String)object6, 0);
                                if (object3 == null) break block12;
                                object6 = S03.DATASETID;
                                String string3 = ((S03)((Object)object6)).getRawValue();
                                string3 = object3.getString(string3, null);
                                Object[] objectArray = S03.URL;
                                String string4 = objectArray.getRawValue();
                                string4 = object3.getString(string4, null);
                                S03 s03 = S03.ACCESSKEY;
                                LinkedHashMap<S03, String> linkedHashMap = s03.getRawValue();
                                object3 = object3.getString((String)((Object)linkedHashMap), null);
                                if (!(string3 == null || (bl4 = b.k(string3)) || string4 == null || (bl4 = b.k(string4)) || object3 == null || (bl4 = b.k((CharSequence)object3)))) {
                                    linkedHashMap = new LinkedHashMap<S03, String>();
                                    objectArray = objectArray.getRawValue();
                                    linkedHashMap.put((S03)objectArray, string4);
                                    object6 = ((S03)((Object)object6)).getRawValue();
                                    linkedHashMap.put((S03)((Object)object6), string3);
                                    object6 = s03.getRawValue();
                                    linkedHashMap.put((S03)((Object)object6), (String)object3);
                                    string2 = string2.toString();
                                    object6 = " \n\nLoading Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ";
                                    int n7 = 3;
                                    objectArray = new Object[n7];
                                    objectArray[0] = string3;
                                    objectArray[n3] = string4;
                                    objectArray[n4] = object3;
                                    sx1$a.b((Ax1)((Object)object4), string2, (String)object6, objectArray);
                                    object5 = linkedHashMap;
                                }
                            }
                            catch (Throwable throwable) {
                                td0.a(object, throwable);
                            }
                        }
                    }
                    if (object5 == null) return;
                    String string5 = S03.URL.getRawValue();
                    string5 = String.valueOf(object5.get(string5));
                    object = new URL(string5);
                    string5 = S03.DATASETID.getRawValue();
                    string5 = String.valueOf(object5.get(string5));
                    charSequence = new StringBuilder();
                    object4 = ((URL)object).getProtocol();
                    charSequence.append((String)object4);
                    object4 = "://";
                    charSequence.append((String)object4);
                    object = ((URL)object).getHost();
                    charSequence.append((String)object);
                    object = charSequence.toString();
                    charSequence = S03.ACCESSKEY.getRawValue();
                    charSequence = String.valueOf(object5.get(charSequence));
                    yn_0.a(string5, (String)object, (String)charSequence);
                    vn_0.c = n3;
                    return;
                }
                object2 = sx1.d;
                object2 = Ax1.APP_EVENTS;
                Intrinsics.checkNotNull(string2, (String)object3);
                object3 = new Object[n3];
                object3[0] = object;
                sx1$a.b((Ax1)((Object)object2), string2, " \n\nGraph Response Received: \n================\n%s\n\n ", (Object[])object3);
                object4 = "CloudBridge Settings API response is not a valid json: \n%s ";
                object3 = "TAG";
                object = ((f)object).b;
                if (object != null) {
                    object5 = "data";
                    try {
                        object5 = object.get((String)object5);
                    }
                    catch (NullPointerException nullPointerException2) {
                        break block13;
                    }
                    catch (JSONException jSONException2) {
                        break block14;
                    }
                }
                object = "null cannot be cast to non-null type org.json.JSONArray";
                Intrinsics.checkNotNull(object5, (String)object);
                object5 = (JSONArray)object5;
                object = lz3_0.h((JSONArray)object5);
                object = CollectionsKt.firstOrNull((List)object);
                object = (String)object;
                object5 = new JSONObject((String)object);
                object = lz3_0.i((JSONObject)object5);
                object5 = S03.URL;
                object5 = ((S03)((Object)object5)).getRawValue();
                object5 = ((HashMap)object).get(object5);
                object5 = (String)object5;
                Object object7 = S03.DATASETID;
                object7 = object7.getRawValue();
                object7 = ((HashMap)object).get(object7);
                object7 = (String)object7;
                Object object8 = S03.ACCESSKEY;
                object8 = object8.getRawValue();
                object8 = ((HashMap)object).get(object8);
                object8 = (String)object8;
                if (object5 != null && object7 != null && object8 != null) {
                    block15: {
                        try {
                            yn_0.a((String)object7, (String)object5, (String)object8);
                            vn_0.a((HashMap)object);
                            object2 = S03.ENABLED;
                            String string6 = ((S03)((Object)object2)).getRawValue();
                            string6 = ((HashMap)object).get(string6);
                            if (string6 == null) break block15;
                            object2 = ((S03)((Object)object2)).getRawValue();
                            object = ((HashMap)object).get(object2);
                            object2 = "null cannot be cast to non-null type kotlin.Boolean";
                        }
                        catch (MalformedURLException malformedURLException) {
                            object2 = sx1.d;
                            object2 = Ax1.APP_EVENTS;
                            Intrinsics.checkNotNullExpressionValue(string2, (String)object3);
                            String string7 = yc0_2.b(malformedURLException);
                            Object[] objectArray = new Object[n3];
                            objectArray[0] = string7;
                            string7 = "CloudBridge Settings API response doesn't have valid url\n %s ";
                            sx1$a.b((Ax1)((Object)object2), string2, string7, objectArray);
                            return;
                        }
                        Intrinsics.checkNotNull(object, (String)object2);
                        object = (Boolean)object;
                        bl2 = (Boolean)object;
                    }
                    vn_0.c = bl2;
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(string2, (String)object3);
                object = "CloudBridge Settings API response doesn't have valid data";
                sx1$a.a((Ax1)((Object)object2), string2, (String)object);
                return;
            }
            object2 = sx1.d;
            object2 = Ax1.APP_EVENTS;
            Intrinsics.checkNotNullExpressionValue(string2, (String)object3);
            String string8 = yc0_2.b(nullPointerException2);
            Object[] objectArray = new Object[n3];
            objectArray[0] = string8;
            sx1$a.b((Ax1)((Object)object2), string2, (String)object4, objectArray);
            return;
        }
        object2 = sx1.d;
        object2 = Ax1.APP_EVENTS;
        Intrinsics.checkNotNullExpressionValue(string2, (String)object3);
        String string9 = yc0_2.b(jSONException2);
        Object[] objectArray = new Object[n3];
        objectArray[0] = string9;
        sx1$a.b((Ax1)((Object)object2), string2, (String)object4, objectArray);
    }
}

