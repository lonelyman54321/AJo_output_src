/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from jJ0
 */
public final class jj0_1
extends zV {
    public final CleverTapInstanceConfig b;
    public final b c;
    public final l80_0 d;

    public jj0_1(CleverTapInstanceConfig object, l80_0 l80_02) {
        this.b = object;
        this.c = object = ((CleverTapInstanceConfig)object).b();
        this.d = l80_02;
    }

    public final void a(Context object, JSONObject jSONObject, String string2) {
        object = this.b;
        string2 = object.a;
        b b2 = this.c;
        String string3 = "Processing Feature Flags response...";
        b2.b(string2, string3);
        boolean bl2 = object.h;
        if (bl2) {
            object = object.a;
            b2.b((String)object, "CleverTap instance is configured to analytics only, not processing Feature Flags response");
            return;
        }
        if (jSONObject == null) {
            object = object.a;
            b2.b((String)object, "Feature Flag : Can't parse Feature Flags Response, JSON response object is null");
            return;
        }
        string2 = "ff_notifs";
        boolean bl3 = jSONObject.has(string2);
        if (!bl3) {
            object = object.a;
            b2.b((String)object, "Feature Flag : JSON object doesn't contain the Feature Flags key");
            return;
        }
        object = object.a;
        string3 = "Feature Flag : Processing Feature Flags response";
        b2.b((String)object, string3);
        object = jSONObject.getJSONObject(string2);
        try {
            this.b((JSONObject)object);
        }
        catch (Throwable throwable) {
            com.clevertap.android.sdk.b.m();
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive exception aggregation
     */
    public final void b(JSONObject object) {
        block9: {
            Object object2;
            block10: {
                object2 = object.getJSONArray("kv");
                if (object2 == null || (object2 = this.d.d) == null) break block10;
                synchronized (object2) {
                    Throwable throwable2;
                    block6: {
                        block8: {
                            JSONException jSONException2;
                            Object object3;
                            block7: {
                                Object object4;
                                Object object5;
                                Object object6;
                                block11: {
                                    int n3;
                                    object6 = "kv";
                                    object6 = object.getJSONArray((String)object6);
                                    object3 = null;
                                    for (int i3 = 0; i3 < (n3 = object6.length()); ++i3) {
                                        object5 = object6.getJSONObject(i3);
                                        object4 = ((nh_1)object2).g;
                                        String string2 = "n";
                                        string2 = object5.getString(string2);
                                        String string3 = "v";
                                        n3 = (int)(object5.getBoolean(string3) ? 1 : 0);
                                        object5 = n3 != 0;
                                        object4.put(string2, object5);
                                    }
                                    break block11;
                                    catch (Throwable throwable2) {
                                        break block6;
                                    }
                                    catch (JSONException jSONException2) {
                                        break block7;
                                    }
                                }
                                object6 = ((nh_1)object2).a;
                                object6 = ((CleverTapInstanceConfig)object6).b();
                                object3 = ((nh_1)object2).b();
                                object5 = new StringBuilder();
                                object4 = "Updating feature flags...";
                                ((StringBuilder)object5).append((String)object4);
                                object4 = ((nh_1)object2).g;
                                ((StringBuilder)object5).append(object4);
                                object5 = ((StringBuilder)object5).toString();
                                ((b)object6).b((String)object3, (String)object5);
                                break block8;
                            }
                            object3 = ((nh_1)object2).a;
                            object3 = ((CleverTapInstanceConfig)object3).b();
                            String string4 = ((nh_1)object2).b();
                            StringBuilder stringBuilder = new StringBuilder();
                            String string5 = "Error parsing Feature Flag array ";
                            stringBuilder.append(string5);
                            String string6 = jSONException2.getLocalizedMessage();
                            stringBuilder.append(string6);
                            string6 = stringBuilder.toString();
                            ((b)object3).b(string4, string6);
                        }
                        ((nh_1)object2).a((JSONObject)object);
                        object = ((nh_1)object2).e;
                        object.getClass();
                        break block9;
                    }
                    throw throwable2;
                }
            }
            object = this.b.b();
            object2 = this.b.a;
            String string7 = "Feature Flag : Can't parse feature flags, CTFeatureFlagsController is null";
            ((b)object).b((String)object2, string7);
        }
    }
}

