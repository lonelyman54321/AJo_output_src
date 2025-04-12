/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.appsflyer.deeplink;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class DeepLink {
    public final JSONObject getMediationNetwork;

    private DeepLink(JSONObject jSONObject) {
        this.getMediationNetwork = jSONObject;
    }

    public static DeepLink getMonetizationNetwork(Map map2) {
        boolean bl2;
        Object object = map2.keySet();
        String string2 = "af_web_id";
        String string3 = "af_deeplink";
        String string4 = "pid";
        Object object2 = "c";
        String string5 = "af_prt";
        String string6 = "af_mp";
        String string7 = "clickid";
        String string8 = "af_siteid";
        String string9 = "af_sub_siteid";
        String string10 = "af_click_lookback";
        String string11 = "af_viewthrough_lookback";
        String string12 = "af_keywords";
        String string13 = "af_cost_model";
        String string14 = "af_cost_currency";
        String string15 = "af_cost_value";
        String string16 = "af_r";
        String string17 = "af_web_dp";
        String string18 = "af_force_deeplink";
        String string19 = "af_ref";
        String string20 = "is_incentivized";
        String string21 = "af_param_forwarding";
        String string22 = "is_retargeting";
        String string23 = "af_reengagement_window";
        String string24 = "is_branded_link";
        String string25 = "is_universal_link";
        String string26 = "af_generated_clk";
        String string27 = "transaction_id";
        String string28 = "af_fp_lookback_window";
        String string29 = "af_vt_fp_lookback_window";
        String string30 = "af_fp_priority";
        String string31 = "af_generate_clk";
        String string32 = "af_inactivity_window";
        String string33 = "af_ol_red";
        String string34 = "af_attr";
        String string35 = "af_ol_lp";
        String string36 = "af_blank_red";
        String string37 = "af_source";
        String string38 = "af_lp_src";
        String string39 = "af_src_browser";
        String string40 = "af_tranid";
        String string41 = "af_wrt_clk";
        String string42 = "af_ua";
        String string43 = "af_ip";
        String string44 = "af_lang";
        String string45 = "advertising_id";
        String string46 = "sha1_advertising_id";
        String string47 = "md5_advertising_id";
        String string48 = "android_id";
        String string49 = "sha1_android_id";
        String string50 = "md5_android_id";
        String string51 = "imei";
        String string52 = "sha1_imei";
        String string53 = "md5_imei";
        String string54 = "oaid";
        String string55 = "sha1_oaid";
        String string56 = "md5_oaid";
        String string57 = "af_android_url";
        String string58 = "sha1_el";
        String string59 = "fire_advertising_id";
        String string60 = "sha1_fire_advertising_id";
        String string61 = "idfa";
        String string62 = "md5_idfa";
        String string63 = "af_ios_url";
        String string64 = "af_ios_fallback";
        String string65 = "sha1_idfa";
        String string66 = "mac";
        String string67 = "sha1_mac";
        String string68 = "af_banner";
        String string69 = "af_slk_web_endpoint";
        String string70 = "af_chrome_lp";
        String string71 = "af_android_custom_url";
        String string72 = "af_ios_custom_url";
        String string73 = "af_enc_data";
        String string74 = "engmnt_source";
        String string75 = "redirect_response_data";
        String string76 = "shortlink";
        String string77 = "advertiserId";
        String string78 = "sha1_advertiserId";
        String string79 = "advertiser_id";
        String string80 = "sha1_advertiser_id";
        String string81 = "muid";
        String string82 = "idfv";
        String string83 = "md5_idfv";
        String string84 = "sha1_idfv";
        String string85 = "af_installpostback";
        String string86 = "http_referrer";
        String string87 = "af_model";
        String string88 = "af_os";
        String string89 = "md5_advertiserId";
        String string90 = "af_video_total_length";
        String string91 = "af_video_played_length";
        String string92 = "af_playable_played_length";
        String string93 = "af_ad_time_viewed";
        String string94 = "af_ad_displayed_percent";
        String string95 = "af_audio_total_length";
        String string96 = "af_audio_played_length";
        String string97 = "af_status";
        HashMap<String, String> hashMap = Arrays.asList("install_time", string4, object2, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, string29, string30, string31, string32, string33, string34, string35, string36, string37, string38, string39, string40, string41, string42, string43, string44, string45, string46, string47, string48, string49, string50, string51, string52, string53, string54, string55, string56, string57, string58, string59, string60, string61, string62, string63, string64, string65, string66, string67, string68, string69, string70, string71, string72, string73, string74, string75, string76, string77, string78, string79, string80, string81, string82, string83, string84, string85, string86, string87, string88, string89, string90, string91, string92, string93, string94, string95, string96, string97, string2, string3);
        object.removeAll((Collection<?>)((Object)hashMap));
        hashMap = new HashMap<String, String>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            string4 = (String)object.next();
            object2 = map2;
            string5 = (String)map2.get(string4);
            ((AbstractMap)hashMap).put(string4, string5);
        }
        object = new JSONObject(hashMap);
        return DeepLink.getRevenue((JSONObject)object);
    }

    public static DeepLink getRevenue(JSONObject jSONObject) {
        Object object = "custom_params";
        JSONObject jSONObject2 = jSONObject.optJSONObject((String)object);
        if (jSONObject2 != null) {
            boolean bl2;
            jSONObject.remove((String)object);
            object = jSONObject2.keys();
            while (bl2 = object.hasNext()) {
                String string2 = (String)object.next();
                Object object2 = jSONObject2.opt(string2);
                jSONObject.put(string2, object2);
            }
        }
        object = new DeepLink(jSONObject);
        return object;
    }

    public String getAfSub1() {
        Object object;
        Object object2 = this.getMediationNetwork.opt("af_sub1");
        if (object2 == (object = JSONObject.NULL)) {
            object2 = null;
        }
        return (String)object2;
    }

    public String getAfSub2() {
        Object object;
        Object object2 = this.getMediationNetwork.opt("af_sub2");
        if (object2 == (object = JSONObject.NULL)) {
            object2 = null;
        }
        return (String)object2;
    }

    public String getAfSub3() {
        Object object;
        Object object2 = this.getMediationNetwork.opt("af_sub3");
        if (object2 == (object = JSONObject.NULL)) {
            object2 = null;
        }
        return (String)object2;
    }

    public String getAfSub4() {
        Object object;
        Object object2 = this.getMediationNetwork.opt("af_sub4");
        if (object2 == (object = JSONObject.NULL)) {
            object2 = null;
        }
        return (String)object2;
    }

    public String getAfSub5() {
        Object object;
        Object object2 = this.getMediationNetwork.opt("af_sub5");
        if (object2 == (object = JSONObject.NULL)) {
            object2 = null;
        }
        return (String)object2;
    }

    public String getCampaign() {
        Object object;
        Object object2 = this.getMediationNetwork.opt("campaign");
        if (object2 == (object = JSONObject.NULL)) {
            object2 = null;
        }
        return (String)object2;
    }

    public String getCampaignId() {
        Object object;
        Object object2 = this.getMediationNetwork.opt("campaign_id");
        if (object2 == (object = JSONObject.NULL)) {
            object2 = null;
        }
        return (String)object2;
    }

    public JSONObject getClickEvent() {
        return this.getMediationNetwork;
    }

    public String getClickHttpReferrer() {
        Object object;
        Object object2 = this.getMediationNetwork.opt("click_http_referrer");
        if (object2 == (object = JSONObject.NULL)) {
            object2 = null;
        }
        return (String)object2;
    }

    public String getDeepLinkValue() {
        Object object;
        Object object2 = this.getMediationNetwork.opt("deep_link_value");
        if (object2 == (object = JSONObject.NULL)) {
            object2 = null;
        }
        return (String)object2;
    }

    public String getMatchType() {
        Object object;
        Object object2 = this.getMediationNetwork.opt("match_type");
        if (object2 == (object = JSONObject.NULL)) {
            object2 = null;
        }
        return (String)object2;
    }

    public String getMediaSource() {
        Object object;
        Object object2 = this.getMediationNetwork.opt("media_source");
        if (object2 == (object = JSONObject.NULL)) {
            object2 = null;
        }
        return (String)object2;
    }

    public String getStringValue(String object) {
        Object object2;
        if ((object = this.getMediationNetwork.opt((String)object)) == (object2 = JSONObject.NULL)) {
            object = null;
        }
        if (object == null) {
            return null;
        }
        return String.valueOf(object);
    }

    public Boolean isDeferred() {
        Object object;
        Object object2 = this.getMediationNetwork.opt("is_deferred");
        if (object2 == (object = JSONObject.NULL)) {
            object2 = null;
        }
        return (Boolean)object2;
    }

    public String toString() {
        return this.getMediationNetwork.toString();
    }
}

