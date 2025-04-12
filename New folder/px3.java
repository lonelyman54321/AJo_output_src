/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.text.TextUtils;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.services.data.Home.CMSNavigation;
import com.ril.ajio.services.data.Home.LinkDetail;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class px3 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a(LinkDetail linkDetail) {
        int n3;
        int n4;
        Object object;
        String string2;
        String string3;
        Object object2;
        block9: {
            object2 = "page";
            string3 = "url_redirect";
            string2 = "url";
            object = "linkDetail";
            Intrinsics.checkNotNullParameter(linkDetail, (String)object);
            n4 = linkDetail.isURLUpdated();
            if (n4 != 0) return;
            object = z40_0.Companion;
            object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
            String string4 = "url_redirect2";
            n3 = TextUtils.isEmpty((CharSequence)(object = ((ao0_0)object).b(string4)));
            if (n3 != 0) return;
            try {
                string4 = new JSONObject((String)object);
                n4 = string4.has(string3);
                if (n4 == 0) return;
                string3 = string4.getJSONArray(string3);
                n4 = string3.length();
                n3 = 0;
                string4 = null;
                break block9;
            }
            catch (JSONException jSONException) {}
            object2 = yn3_0.a;
            ((yn3$a)object2).e(jSONException);
            return;
        }
        while (n3 < n4) {
            boolean bl2;
            String string5;
            Object object3 = string3.getJSONObject(n3);
            String string6 = "oldUrl";
            object3 = object3.getJSONObject(string6);
            boolean bl3 = linkDetail.isURLUpdated();
            if (!bl3 && (string6 = linkDetail.getUrl()) != null && (bl3 = object3.has(string2)) && (bl3 = b.i(string6 = linkDetail.getUrl(), string5 = object3.getString(string2), bl2 = true))) {
                boolean bl4;
                string6 = linkDetail.getQuery();
                string5 = "query";
                if (string6 == null || (bl3 = object3.has(string5)) && (bl4 = b.i(string6 = linkDetail.getQuery(), (String)(object3 = object3.getString(string5)), bl2))) {
                    boolean bl5;
                    boolean bl6;
                    string3 = string3.getJSONObject(n3);
                    object = "newUrl";
                    n4 = (int)((string3 = string3.getJSONObject((String)object)).has(string2) ? 1 : 0);
                    if (n4 != 0) {
                        string2 = string3.getString(string2);
                        linkDetail.setUrl(string2);
                    }
                    if (bl6 = string3.has((String)object2)) {
                        object2 = string3.getString((String)object2);
                        linkDetail.setPage((String)object2);
                    }
                    if (bl5 = string3.has(string5)) {
                        object2 = string3.getString(string5);
                        linkDetail.setQuery((String)object2);
                    } else {
                        bl5 = false;
                        object2 = null;
                        linkDetail.setQuery(null);
                    }
                    linkDetail.setURLUpdated(bl2);
                    return;
                }
            }
            ++n3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void b(CMSNavigation cMSNavigation) {
        int n3;
        int n4;
        Object object;
        String string2;
        String string3;
        Object object2;
        block9: {
            object2 = "page";
            string3 = "url_redirect";
            string2 = "url";
            object = "cmsNavigation";
            Intrinsics.checkNotNullParameter(cMSNavigation, (String)object);
            n4 = cMSNavigation.isURLUpdated();
            if (n4 != 0) return;
            object = z40_0.Companion;
            object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
            String string4 = "url_redirect2";
            n3 = TextUtils.isEmpty((CharSequence)(object = ((ao0_0)object).b(string4)));
            if (n3 != 0) return;
            try {
                string4 = new JSONObject((String)object);
                n4 = string4.has(string3);
                if (n4 == 0) return;
                string3 = string4.getJSONArray(string3);
                n4 = string3.length();
                n3 = 0;
                string4 = null;
                break block9;
            }
            catch (JSONException jSONException) {}
            object2 = yn3_0.a;
            ((yn3$a)object2).e(jSONException);
            return;
        }
        while (n3 < n4) {
            boolean bl2;
            String string5;
            Object object3 = string3.getJSONObject(n3);
            String string6 = "oldUrl";
            object3 = object3.getJSONObject(string6);
            boolean bl3 = cMSNavigation.isURLUpdated();
            if (!bl3 && (string6 = cMSNavigation.getUrl()) != null && (bl3 = object3.has(string2)) && (bl3 = b.i(string6 = cMSNavigation.getUrl(), string5 = object3.getString(string2), bl2 = true))) {
                boolean bl4;
                string6 = cMSNavigation.getQuery();
                string5 = "query";
                if (string6 == null || (bl3 = object3.has(string5)) && (bl4 = b.i(string6 = cMSNavigation.getQuery(), (String)(object3 = object3.getString(string5)), bl2))) {
                    boolean bl5;
                    boolean bl6;
                    string3 = string3.getJSONObject(n3);
                    object = "newUrl";
                    n4 = (int)((string3 = string3.getJSONObject((String)object)).has(string2) ? 1 : 0);
                    if (n4 != 0) {
                        string2 = string3.getString(string2);
                        cMSNavigation.setUrl(string2);
                    }
                    if (bl6 = string3.has((String)object2)) {
                        object2 = string3.getString((String)object2);
                        cMSNavigation.setPageType((String)object2);
                    }
                    if (bl5 = string3.has(string5)) {
                        object2 = string3.getString(string5);
                        cMSNavigation.setQuery((String)object2);
                    } else {
                        bl5 = false;
                        object2 = null;
                        cMSNavigation.setQuery(null);
                    }
                    cMSNavigation.setURLUpdated(bl2);
                    return;
                }
            }
            ++n3;
        }
    }
}

