/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipData
 *  android.content.ClipboardManager
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Toast
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.inbox.CTInboxListViewFragment;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.inbox.CTInboxMessageContent;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from jI
 */
public final class ji_1
implements View.OnClickListener {
    public final JSONObject a;
    public final String b;
    public final CTInboxListViewFragment c;
    public final CTInboxMessage d;
    public final int e;
    public final ViewPager f;
    public final int g;

    public ji_1(int n3, CTInboxMessage cTInboxMessage, CTInboxListViewFragment cTInboxListViewFragment, ViewPager viewPager) {
        this.e = n3;
        this.d = cTInboxMessage;
        this.b = null;
        this.c = cTInboxListViewFragment;
        this.f = viewPager;
        this.g = -1;
    }

    public ji_1(int n3, CTInboxMessage cTInboxMessage, String string2, JSONObject jSONObject, CTInboxListViewFragment cTInboxListViewFragment, int n4) {
        this.e = n3;
        this.d = cTInboxMessage;
        this.b = string2;
        this.c = cTInboxListViewFragment;
        this.a = jSONObject;
        this.g = n4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onClick(View object) {
        Object object2;
        block16: {
            int n3;
            String string2;
            Object object3;
            Object object4;
            block19: {
                boolean bl2;
                Object object5;
                Object object6;
                Object object7;
                block17: {
                    block18: {
                        JSONException jSONException2;
                        block14: {
                            boolean bl3;
                            String string3;
                            block13: {
                                block12: {
                                    object = this.f;
                                    object2 = this.c;
                                    if (object != null) {
                                        if (object2 == null) return;
                                        int n4 = this.e;
                                        int n7 = ((ViewPager)((Object)object)).getCurrentItem();
                                        ((CTInboxListViewFragment)object2).Qa(n4, n7);
                                        return;
                                    }
                                    object = this.b;
                                    if (object == null || (object7 = this.a) == null) break block16;
                                    if (object2 == null) return;
                                    object6 = this.d;
                                    object5 = ((CTInboxMessage)object6).j;
                                    bl2 = false;
                                    ((CTInboxMessageContent)((ArrayList)object5).get(0)).getClass();
                                    object5 = CTInboxMessageContent.e((JSONObject)object7);
                                    boolean bl4 = ((String)object5).equalsIgnoreCase("copy");
                                    boolean bl5 = false;
                                    object4 = null;
                                    if (!bl4 || (object5 = ((Fragment)object2).getActivity()) == null) break block17;
                                    object2 = ((Fragment)object2).getActivity();
                                    object5 = (ClipboardManager)object2.getSystemService("clipboard");
                                    ((CTInboxMessageContent)((CTInboxMessage)object6).j.get(0)).getClass();
                                    object3 = "text";
                                    string3 = "copyText";
                                    string2 = "";
                                    try {
                                        bl3 = object7.has(string3);
                                        if (!bl3) break block12;
                                        string3 = object7.getJSONObject(string3);
                                        break block13;
                                    }
                                    catch (JSONException jSONException2) {
                                        break block14;
                                    }
                                }
                                n3 = 0;
                                string3 = null;
                            }
                            if (string3 != null && (bl3 = string3.has((String)object3))) {
                                string2 = string3.getString((String)object3);
                            }
                            break block18;
                        }
                        jSONException2.getLocalizedMessage();
                        com.clevertap.android.sdk.b.j();
                    }
                    object = ClipData.newPlainText((CharSequence)object, (CharSequence)string2);
                    if (object5 != null) {
                        object5.setPrimaryClip((ClipData)object);
                        object = Toast.makeText((Context)object2, (CharSequence)"Text Copied to Clipboard", (int)0);
                        object.show();
                    }
                }
                if ((object = ((CTInboxMessage)object6).j) != null && (object2 = ((ArrayList)object).get(0)) != null) {
                    ((CTInboxMessageContent)((ArrayList)object).get(0)).getClass();
                    object2 = CTInboxMessageContent.e((JSONObject)object7);
                    object6 = "kv";
                    boolean bl6 = ((String)object6).equalsIgnoreCase((String)object2);
                    if (bl6) {
                        object = (CTInboxMessageContent)((ArrayList)object).get(0);
                        object.getClass();
                        boolean bl7 = object7.has((String)object6);
                        if (bl7) {
                            JSONException jSONException3;
                            block15: {
                                try {
                                    boolean bl8;
                                    object = object7.getJSONObject((String)object6);
                                    object2 = object.keys();
                                    object7 = new HashMap();
                                    while (bl8 = object2.hasNext()) {
                                        object6 = object2.next();
                                        object6 = (String)object6;
                                        object5 = object.getString((String)object6);
                                        bl2 = TextUtils.isEmpty((CharSequence)object6);
                                        if (bl2) continue;
                                        ((HashMap)object7).put(object6, object5);
                                    }
                                }
                                catch (JSONException jSONException3) {
                                    break block15;
                                }
                                bl7 = ((HashMap)object7).isEmpty();
                                if (!bl7) {
                                    object4 = object7;
                                }
                                break block19;
                            }
                            jSONException3.getLocalizedMessage();
                            com.clevertap.android.sdk.b.j();
                        }
                    }
                }
            }
            string2 = this.b;
            JSONObject jSONObject = this.a;
            object3 = this.c;
            n3 = this.e;
            int n8 = this.g;
            ((CTInboxListViewFragment)object3).Pa(n3, string2, jSONObject, (HashMap)object4, n8);
            return;
        }
        if (object2 == null) return;
        boolean bl9 = false;
        Object var6_10 = null;
        boolean bl10 = false;
        Object var7_12 = null;
        int n10 = this.e;
        boolean bl11 = false;
        int n14 = this.g;
        ((CTInboxListViewFragment)object2).Pa(n10, null, null, null, n14);
    }
}

