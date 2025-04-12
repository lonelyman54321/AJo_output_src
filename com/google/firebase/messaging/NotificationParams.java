/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.graphics.Color
 *  android.net.Uri
 *  android.os.Bundle
 *  android.text.TextUtils
 *  org.json.JSONArray
 *  org.json.JSONException
 */
package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

public class NotificationParams {
    private static final int COLOR_TRANSPARENT_IN_HEX = -16777216;
    private static final int EMPTY_JSON_ARRAY_LENGTH = 1;
    private static final String TAG = "NotificationParams";
    private static final int VISIBILITY_MAX = 1;
    private static final int VISIBILITY_MIN = 255;
    private final Bundle data;

    public NotificationParams(Bundle object) {
        if (object != null) {
            Bundle bundle;
            this.data = bundle = new Bundle(object);
            return;
        }
        super("data");
        throw object;
    }

    private static int getLightColor(String object) {
        int n3;
        int n4 = Color.parseColor((String)object);
        if (n4 != (n3 = -16777216)) {
            return n4;
        }
        object = new IllegalArgumentException("Transparent color is invalid");
        throw object;
    }

    private static boolean isAnalyticsKey(String string2) {
        boolean bl2;
        String string3 = "google.c.a.";
        boolean bl3 = string2.startsWith(string3);
        if (!bl3 && !(bl2 = string2.equals(string3 = "from"))) {
            bl2 = false;
            string2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public static boolean isNotification(Bundle object) {
        boolean bl2;
        String string2 = "1";
        String string3 = "gcm.n.e";
        String string4 = object.getString(string3);
        boolean bl3 = string2.equals(string4);
        if (!bl3 && !(bl2 = string2.equals(object = object.getString(string3 = NotificationParams.keyWithOldPrefix(string3))))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    private static boolean isReservedKey(String string2) {
        boolean bl2;
        String string3 = "google.c.";
        boolean bl3 = string2.startsWith(string3);
        if (!(bl3 || (bl3 = string2.startsWith(string3 = "gcm.n.")) || (bl2 = string2.startsWith(string3 = "gcm.notification.")))) {
            bl2 = false;
            string2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    private static String keyWithOldPrefix(String string2) {
        String string3 = "gcm.n.";
        boolean bl2 = string2.startsWith(string3);
        if (!bl2) {
            return string2;
        }
        return string2.replace(string3, "gcm.notification.");
    }

    private String normalizePrefix(String string2) {
        Bundle bundle;
        boolean bl2;
        Object object = this.data;
        boolean bl3 = object.containsKey(string2);
        if (!bl3 && (bl3 = string2.startsWith((String)(object = "gcm.n."))) && (bl2 = (bundle = this.data).containsKey((String)(object = NotificationParams.keyWithOldPrefix(string2))))) {
            return object;
        }
        return string2;
    }

    private static String userFriendlyKey(String string2) {
        String string3 = "gcm.n.";
        int n3 = string2.startsWith(string3);
        if (n3 != 0) {
            n3 = 6;
            string2 = string2.substring(n3);
        }
        return string2;
    }

    public boolean getBoolean(String string2) {
        boolean bl2;
        String string3 = "1";
        boolean bl3 = string3.equals(string2 = this.getString(string2));
        if (!bl3 && !(bl2 = Boolean.parseBoolean(string2))) {
            bl2 = false;
            string2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public Integer getInteger(String string2) {
        String string3 = this.getString(string2);
        boolean bl2 = TextUtils.isEmpty((CharSequence)string3);
        if (!bl2) {
            int n3 = Integer.parseInt(string3);
            try {
                return n3;
            }
            catch (NumberFormatException numberFormatException) {
                NotificationParams.userFriendlyKey(string2);
            }
        }
        return null;
    }

    public JSONArray getJSONArray(String string2) {
        String string3 = this.getString(string2);
        boolean bl2 = TextUtils.isEmpty((CharSequence)string3);
        if (!bl2) {
            try {
                JSONArray jSONArray = new JSONArray(string3);
                return jSONArray;
            }
            catch (JSONException jSONException) {
                NotificationParams.userFriendlyKey(string2);
            }
        }
        return null;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int[] getLightSettings() {
        JSONArray jSONArray = this.getJSONArray("gcm.n.light_settings");
        if (jSONArray == null) {
            return null;
        }
        int n3 = 3;
        Object object = new int[n3];
        try {
            int n4 = jSONArray.length();
            if (n4 == n3) {
                n3 = 0;
                Object var5_5 = null;
                String string2 = jSONArray.optString(0);
                object[0] = n4 = NotificationParams.getLightColor(string2);
                n3 = 1;
                object[n3] = n4 = jSONArray.optInt(n3);
                n3 = 2;
                object[n3] = n4 = jSONArray.optInt(n3);
                return object;
            }
        }
        catch (IllegalArgumentException illegalArgumentException2222) {
        }
        object = "lightSettings don't have all three fields";
        JSONException jSONException = new JSONException((String)object);
        throw jSONException;
        catch (JSONException jSONException2) {
            jSONArray.toString();
            return null;
        }
        jSONArray.toString();
        illegalArgumentException2222.getMessage();
        return null;
    }

    public Uri getLink() {
        String string2 = this.getString("gcm.n.link_android");
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            string2 = this.getString("gcm.n.link");
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)string2))) {
            return Uri.parse((String)string2);
        }
        return null;
    }

    public Object[] getLocalizationArgsForKey(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append("_loc_args");
        string2 = stringBuilder.toString();
        string2 = this.getJSONArray(string2);
        if (string2 == null) {
            return null;
        }
        int n3 = string2.length();
        Object[] objectArray = new String[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            String string3 = string2.optString(i3);
            objectArray[i3] = string3;
        }
        return objectArray;
    }

    public String getLocalizationResourceForKey(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append("_loc_key");
        string2 = stringBuilder.toString();
        return this.getString(string2);
    }

    public String getLocalizedString(Resources resources, String string2, String string3) {
        Object[] objectArray = this.getLocalizationResourceForKey(string3);
        boolean bl2 = TextUtils.isEmpty((CharSequence)objectArray);
        if (bl2) {
            return null;
        }
        String string4 = "string";
        int n3 = resources.getIdentifier((String)objectArray, string4, string2);
        if (n3 == 0) {
            NotificationParams.userFriendlyKey(Ft2.a(string3, "_loc_key"));
            return null;
        }
        objectArray = this.getLocalizationArgsForKey(string3);
        if (objectArray == null) {
            return resources.getString(n3);
        }
        try {
            return resources.getString(n3, objectArray);
        }
        catch (MissingFormatArgumentException missingFormatArgumentException) {
            NotificationParams.userFriendlyKey(string3);
            Arrays.toString(objectArray);
            return null;
        }
    }

    public Long getLong(String string2) {
        String string3 = this.getString(string2);
        boolean bl2 = TextUtils.isEmpty((CharSequence)string3);
        if (!bl2) {
            long l2 = Long.parseLong(string3);
            try {
                return l2;
            }
            catch (NumberFormatException numberFormatException) {
                NotificationParams.userFriendlyKey(string2);
            }
        }
        return null;
    }

    public String getNotificationChannelId() {
        return this.getString("gcm.n.android_channel_id");
    }

    public Integer getNotificationCount() {
        Integer n3 = this.getInteger("gcm.n.notification_count");
        if (n3 == null) {
            return null;
        }
        int n4 = n3;
        if (n4 < 0) {
            return null;
        }
        return n3;
    }

    public Integer getNotificationPriority() {
        int n3;
        Integer n4 = this.getInteger("gcm.n.notification_priority");
        if (n4 == null) {
            return null;
        }
        int n7 = n4;
        if (n7 >= (n3 = -2) && (n7 = n4.intValue()) <= (n3 = 2)) {
            return n4;
        }
        return null;
    }

    public String getPossiblyLocalizedString(Resources resources, String string2, String string3) {
        String string4 = this.getString(string3);
        boolean bl2 = TextUtils.isEmpty((CharSequence)string4);
        if (!bl2) {
            return string4;
        }
        return this.getLocalizedString(resources, string2, string3);
    }

    public String getSoundResourceName() {
        String string2 = this.getString("gcm.n.sound2");
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            string2 = this.getString("gcm.n.sound");
        }
        return string2;
    }

    public String getString(String string2) {
        Bundle bundle = this.data;
        string2 = this.normalizePrefix(string2);
        return bundle.getString(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long[] getVibrateTimings() {
        JSONArray jSONArray = this.getJSONArray("gcm.n.vibrate_timings");
        if (jSONArray == null) {
            return null;
        }
        try {
            int n3 = jSONArray.length();
            int n4 = 1;
            if (n3 <= n4) {
                String string2 = "vibrateTimings have invalid length";
                JSONException jSONException = new JSONException(string2);
                throw jSONException;
            }
            n3 = jSONArray.length();
            long[] lArray = new long[n3];
            int n7 = 0;
            while (true) {
                long l2;
                if (n7 >= n3) {
                    return lArray;
                }
                lArray[n7] = l2 = jSONArray.optLong(n7);
                ++n7;
            }
        }
        catch (NumberFormatException | JSONException throwable) {}
        jSONArray.toString();
        return null;
    }

    public Integer getVisibility() {
        int n3;
        Integer n4 = this.getInteger("gcm.n.visibility");
        if (n4 == null) {
            return null;
        }
        int n7 = n4;
        if (n7 >= (n3 = -1) && (n7 = n4.intValue()) <= (n3 = 1)) {
            return n4;
        }
        return null;
    }

    public boolean hasImage() {
        return TextUtils.isEmpty((CharSequence)this.getString("gcm.n.image")) ^ true;
    }

    public boolean isNotification() {
        return this.getBoolean("gcm.n.e");
    }

    public Bundle paramsForAnalyticsIntent() {
        boolean bl2;
        Object object = this.data;
        Bundle bundle = new Bundle((Bundle)object);
        object = this.data.keySet().iterator();
        while (bl2 = object.hasNext()) {
            String string2 = (String)object.next();
            boolean bl3 = NotificationParams.isAnalyticsKey(string2);
            if (bl3) continue;
            bundle.remove(string2);
        }
        return bundle;
    }

    public Bundle paramsWithReservedKeysRemoved() {
        boolean bl2;
        Object object = this.data;
        Bundle bundle = new Bundle((Bundle)object);
        object = this.data.keySet().iterator();
        while (bl2 = object.hasNext()) {
            String string2 = (String)object.next();
            boolean bl3 = NotificationParams.isReservedKey(string2);
            if (!bl3) continue;
            bundle.remove(string2);
        }
        return bundle;
    }
}

