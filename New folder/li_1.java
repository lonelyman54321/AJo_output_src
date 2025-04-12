/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.CTInAppAction$a;
import com.clevertap.android.sdk.inapp.InAppController;
import com.clevertap.android.sdk.inapp.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from LI
 */
public final class li_1 {
    public final WeakReference a;
    public final a b;

    public li_1(com.clevertap.android.sdk.a a2, a a3) {
        WeakReference<com.clevertap.android.sdk.a> weakReference;
        this.a = weakReference = new WeakReference<com.clevertap.android.sdk.a>(a2);
        this.b = a3;
    }

    public void addMultiValueForKey(String string2, String object) {
        boolean bl2;
        Object object2 = (com.clevertap.android.sdk.a)this.a.get();
        if (object2 == null) {
            com.clevertap.android.sdk.b.c();
        } else if (object != null && !(bl2 = ((String)object).isEmpty())) {
            object = Collections.singletonList(object);
            ArrayList<Object> arrayList = new ArrayList<Object>((Collection<Object>)object);
            object = ((com.clevertap.android.sdk.a)object2).b.f;
            object2 = jh_1.a(((we)object).e).b();
            pe_0 pe_02 = new pe_0((we)object, arrayList, string2);
            string2 = "addMultiValuesForKey";
            ((com.clevertap.android.sdk.task.a)object2).c(string2, pe_02);
        } else {
            object = ((com.clevertap.android.sdk.a)object2).b.f;
            ((we)object).R(string2);
        }
    }

    public void addMultiValuesForKey(String string2, String object) {
        Object object2 = (com.clevertap.android.sdk.a)this.a.get();
        if (object2 == null) {
            com.clevertap.android.sdk.b.c();
        } else {
            if (string2 == null) {
                com.clevertap.android.sdk.b.j();
                return;
            }
            if (object != null) {
                Object object3 = new JSONArray((String)object);
                object = yz3_0.b((JSONArray)object3);
                object2 = ((com.clevertap.android.sdk.a)object2).b;
                object2 = ((H80)object2).f;
                object3 = ((we)object2).e;
                object3 = jh_1.a((CleverTapInstanceConfig)object3);
                object3 = ((kh_1)object3).b();
                pe_0 pe_02 = new pe_0((we)object2, (ArrayList)object, string2);
                string2 = "addMultiValuesForKey";
                try {
                    ((com.clevertap.android.sdk.task.a)object3).c(string2, pe_02);
                }
                catch (JSONException jSONException) {
                    jSONException.getLocalizedMessage();
                    com.clevertap.android.sdk.b.j();
                }
            } else {
                com.clevertap.android.sdk.b.j();
            }
        }
    }

    public void decrementValue(String string2, double d2) {
        Object object = (com.clevertap.android.sdk.a)this.a.get();
        if (object == null) {
            com.clevertap.android.sdk.b.c();
        } else {
            Double d5 = d2;
            we we2 = ((com.clevertap.android.sdk.a)object).b.f;
            object = "$decr";
            we2.Q(d5, string2, (String)object);
        }
    }

    public void dismissInAppNotification() {
        Object object = (com.clevertap.android.sdk.a)this.a.get();
        if (object == null) {
            com.clevertap.android.sdk.b.c();
        } else {
            object = this.b;
            if (object != null) {
                ((a)object).Pa(null);
            }
        }
    }

    public int getSdkVersion() {
        return 70103;
    }

    public void incrementValue(String string2, double d2) {
        Object object = (com.clevertap.android.sdk.a)this.a.get();
        if (object == null) {
            com.clevertap.android.sdk.b.c();
        } else {
            Double d5 = d2;
            we we2 = ((com.clevertap.android.sdk.a)object).b.f;
            object = "$incr";
            we2.Q(d5, string2, (String)object);
        }
    }

    public void onUserLogin(String object) {
        com.clevertap.android.sdk.a a2 = (com.clevertap.android.sdk.a)this.a.get();
        if (a2 == null) {
            com.clevertap.android.sdk.b.c();
        } else if (object != null) {
            JSONObject jSONObject = new JSONObject((String)object);
            object = yz3_0.c(jSONObject);
            try {
                a2.n((HashMap)object);
            }
            catch (JSONException jSONException) {
                jSONException.getLocalizedMessage();
                com.clevertap.android.sdk.b.j();
            }
        } else {
            com.clevertap.android.sdk.b.j();
        }
    }

    public void promptPushPermission(boolean bl2) {
        Object object = (com.clevertap.android.sdk.a)this.a.get();
        if (object == null) {
            com.clevertap.android.sdk.b.c();
        } else {
            this.dismissInAppNotification();
            Object object2 = ((com.clevertap.android.sdk.a)object).a;
            int n3 = 32;
            boolean bl3 = qi_2.f(n3, object2);
            if (bl3) {
                String string2;
                object = ((com.clevertap.android.sdk.a)object).b.k;
                object.getClass();
                object2 = "fallbackToNotificationSettings";
                JSONObject jSONObject = new JSONObject();
                boolean bl4 = true;
                try {
                    jSONObject.put((String)object2, bl2);
                    string2 = "isHardPermissionRequest";
                }
                catch (JSONException jSONException) {}
                jSONObject.put(string2, bl4);
                string2 = ((InAppController)object).d;
                String string3 = "android.permission.POST_NOTIFICATIONS";
                int n4 = t70.checkSelfPermission((Context)string2, string3);
                int n7 = -1;
                if (n4 == n7) {
                    CleverTapInstanceConfig cleverTapInstanceConfig = ((InAppController)object).c;
                    yi_1.a((Context)string2, cleverTapInstanceConfig);
                    bl2 = yi_1.c;
                    cleverTapInstanceConfig = E80.e();
                    if (cleverTapInstanceConfig == null) {
                        com.clevertap.android.sdk.b.c();
                    } else {
                        bl4 = androidx.core.app.b.b((Activity)cleverTapInstanceConfig, string3);
                        if (!bl2 && bl4) {
                            bl2 = false;
                            string2 = null;
                            bl3 = jSONObject.optBoolean((String)object2, false);
                            if (!bl3) {
                                com.clevertap.android.sdk.b.j();
                                ((InAppController)object).i(false);
                            } else {
                                ((InAppController)object).p(jSONObject);
                            }
                        } else {
                            ((InAppController)object).p(jSONObject);
                        }
                    }
                } else {
                    ((InAppController)object).i(bl4);
                }
            } else {
                com.clevertap.android.sdk.b.j();
            }
        }
    }

    /*
     * Loose catch block
     */
    public void pushChargedEvent(String string2, String arrayList) {
        block21: {
            block20: {
                JSONObject jSONObject;
                com.clevertap.android.sdk.a a2;
                block19: {
                    a2 = (com.clevertap.android.sdk.a)this.a.get();
                    if (a2 != null) break block19;
                    com.clevertap.android.sdk.b.c();
                    break block20;
                }
                HashMap hashMap = new HashMap();
                if (string2 == null) break block21;
                try {
                    jSONObject = new JSONObject(string2);
                    hashMap = yz3_0.c(jSONObject);
                }
                catch (JSONException jSONException) {
                    jSONException.getLocalizedMessage();
                    com.clevertap.android.sdk.b.j();
                }
                if (arrayList != null) {
                    block18: {
                        string2 = new JSONArray((String)((Object)arrayList));
                        arrayList = yz3_0.a;
                        arrayList = new ArrayList<JSONObject>();
                        int n3 = 0;
                        jSONObject = null;
                        while (true) {
                            int n4 = string2.length();
                            if (n3 >= n4) break block18;
                            Object object = string2.getJSONObject(n3);
                            object = yz3_0.c(object);
                            try {
                                arrayList.add((JSONObject)object);
                            }
                            catch (JSONException jSONException) {
                                jSONException.getMessage();
                                com.clevertap.android.sdk.b.j();
                            }
                            ++n3;
                        }
                        {
                            catch (JSONException jSONException) {
                                jSONException.getLocalizedMessage();
                                com.clevertap.android.sdk.b.j();
                                arrayList = null;
                            }
                        }
                    }
                    a2.o(hashMap, arrayList);
                }
            }
            return;
        }
        com.clevertap.android.sdk.b.j();
    }

    public void pushEvent(String string2) {
        String string3;
        boolean bl2;
        com.clevertap.android.sdk.a a2 = (com.clevertap.android.sdk.a)this.a.get();
        if (a2 == null) {
            com.clevertap.android.sdk.b.c();
        } else if (string2 != null && !(bl2 = (string3 = string2.trim()).isEmpty())) {
            bl2 = false;
            string3 = null;
            a2.p(string2, null);
        }
    }

    public void pushEvent(String string2, String object) {
        com.clevertap.android.sdk.a a2 = (com.clevertap.android.sdk.a)this.a.get();
        if (a2 == null) {
            com.clevertap.android.sdk.b.c();
        } else if (object != null) {
            JSONObject jSONObject = new JSONObject((String)object);
            object = yz3_0.c(jSONObject);
            try {
                a2.p(string2, (Map)object);
            }
            catch (JSONException jSONException) {
                jSONException.getLocalizedMessage();
                com.clevertap.android.sdk.b.j();
            }
        } else {
            com.clevertap.android.sdk.b.j();
        }
    }

    public void pushProfile(String object) {
        com.clevertap.android.sdk.a a2 = (com.clevertap.android.sdk.a)this.a.get();
        if (a2 == null) {
            com.clevertap.android.sdk.b.c();
        } else if (object != null) {
            JSONObject jSONObject = new JSONObject((String)object);
            object = yz3_0.c(jSONObject);
            try {
                a2.q((HashMap)object);
            }
            catch (JSONException jSONException) {
                jSONException.getLocalizedMessage();
                com.clevertap.android.sdk.b.j();
            }
        } else {
            com.clevertap.android.sdk.b.j();
        }
    }

    public void removeMultiValueForKey(String string2, String object) {
        Object object2 = (com.clevertap.android.sdk.a)this.a.get();
        if (object2 == null) {
            com.clevertap.android.sdk.b.c();
        } else {
            if (string2 == null) {
                com.clevertap.android.sdk.b.j();
                return;
            }
            if (object == null) {
                com.clevertap.android.sdk.b.j();
                return;
            }
            boolean bl2 = ((String)object).isEmpty();
            if (bl2) {
                object = ((com.clevertap.android.sdk.a)object2).b.f;
                ((we)object).R(string2);
            } else {
                object = Collections.singletonList(object);
                ArrayList<String> arrayList = new ArrayList<String>((Collection<String>)object);
                object = ((com.clevertap.android.sdk.a)object2).b.f;
                object2 = jh_1.a(((we)object).e).b();
                te_1 te_12 = new te_1((we)object, arrayList, string2);
                string2 = "removeMultiValuesForKey";
                ((com.clevertap.android.sdk.task.a)object2).c(string2, te_12);
            }
        }
    }

    public void removeMultiValuesForKey(String string2, String object) {
        Object object2 = (com.clevertap.android.sdk.a)this.a.get();
        if (object2 == null) {
            com.clevertap.android.sdk.b.c();
        } else {
            if (string2 == null) {
                com.clevertap.android.sdk.b.j();
                return;
            }
            if (object != null) {
                Object object3 = new JSONArray((String)object);
                object = yz3_0.b((JSONArray)object3);
                object2 = ((com.clevertap.android.sdk.a)object2).b;
                object2 = ((H80)object2).f;
                object3 = ((we)object2).e;
                object3 = jh_1.a((CleverTapInstanceConfig)object3);
                object3 = ((kh_1)object3).b();
                te_1 te_12 = new te_1((we)object2, (ArrayList)object, string2);
                string2 = "removeMultiValuesForKey";
                try {
                    ((com.clevertap.android.sdk.task.a)object3).c(string2, te_12);
                }
                catch (JSONException jSONException) {
                    jSONException.getLocalizedMessage();
                    com.clevertap.android.sdk.b.j();
                }
            } else {
                com.clevertap.android.sdk.b.j();
            }
        }
    }

    public void removeValueForKey(String string2) {
        Object object = (com.clevertap.android.sdk.a)this.a.get();
        if (object == null) {
            com.clevertap.android.sdk.b.c();
        } else {
            if (string2 == null) {
                com.clevertap.android.sdk.b.j();
                return;
            }
            object = ((com.clevertap.android.sdk.a)object).b.f;
            com.clevertap.android.sdk.task.a a2 = jh_1.a(((we)object).e).b();
            ue_1 ue_12 = new ue_1((we)object, string2);
            string2 = "removeValueForKey";
            a2.c(string2, ue_12);
        }
    }

    public void setMultiValueForKey(String string2, String object) {
        Object object2 = (com.clevertap.android.sdk.a)this.a.get();
        if (object2 == null) {
            com.clevertap.android.sdk.b.c();
        } else {
            if (string2 == null) {
                com.clevertap.android.sdk.b.j();
                return;
            }
            if (object != null) {
                Object object3 = new JSONArray((String)object);
                object = yz3_0.b((JSONArray)object3);
                object2 = ((com.clevertap.android.sdk.a)object2).b;
                object2 = ((H80)object2).f;
                object3 = ((we)object2).e;
                object3 = jh_1.a((CleverTapInstanceConfig)object3);
                object3 = ((kh_1)object3).b();
                ve ve2 = new ve((we)object2, (ArrayList)object, string2);
                string2 = "setMultiValuesForKey";
                try {
                    ((com.clevertap.android.sdk.task.a)object3).c(string2, ve2);
                }
                catch (JSONException jSONException) {
                    jSONException.getLocalizedMessage();
                    com.clevertap.android.sdk.b.j();
                }
            } else {
                com.clevertap.android.sdk.b.j();
            }
        }
    }

    public void triggerInAppAction(String string2, String string3, String string4) {
        CTInAppAction$a cTInAppAction$a;
        Object object;
        Object object2;
        String string5;
        block12: {
            block11: {
                string5 = "CTWebInterface invalid action JSON: ";
                object2 = (com.clevertap.android.sdk.a)this.a.get();
                if (object2 == null) {
                    com.clevertap.android.sdk.b.c();
                    return;
                }
                object2 = this.b;
                if (object2 == null) {
                    com.clevertap.android.sdk.b.c();
                    return;
                }
                if (string2 == null) {
                    com.clevertap.android.sdk.b.c();
                    return;
                }
                object = new JSONObject(string2);
                cTInAppAction$a = CTInAppAction.CREATOR;
                cTInAppAction$a.getClass();
                object = CTInAppAction$a.a(object);
                if (object != null) break block11;
                string5.concat(string2);
                com.clevertap.android.sdk.b.c();
                return;
            }
            cTInAppAction$a = new Bundle();
            if (string4 == null) break block12;
            String string6 = "button_id";
            cTInAppAction$a.putString(string6, string4);
        }
        try {
            ((a)object2).Ta((CTInAppAction)object, string3, (Bundle)cTInAppAction$a);
        }
        catch (JSONException jSONException) {
            string5.concat(string2);
            com.clevertap.android.sdk.b.c();
        }
    }
}

