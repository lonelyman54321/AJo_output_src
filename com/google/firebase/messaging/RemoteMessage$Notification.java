/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.firebase.messaging;

import android.net.Uri;
import com.google.firebase.messaging.NotificationParams;
import com.google.firebase.messaging.RemoteMessage$1;

public class RemoteMessage$Notification {
    private final String body;
    private final String[] bodyLocArgs;
    private final String bodyLocKey;
    private final String channelId;
    private final String clickAction;
    private final String color;
    private final boolean defaultLightSettings;
    private final boolean defaultSound;
    private final boolean defaultVibrateTimings;
    private final Long eventTime;
    private final String icon;
    private final String imageUrl;
    private final int[] lightSettings;
    private final Uri link;
    private final boolean localOnly;
    private final Integer notificationCount;
    private final Integer notificationPriority;
    private final String sound;
    private final boolean sticky;
    private final String tag;
    private final String ticker;
    private final String title;
    private final String[] titleLocArgs;
    private final String titleLocKey;
    private final long[] vibrateTimings;
    private final Integer visibility;

    private RemoteMessage$Notification(NotificationParams object) {
        boolean bl2;
        String string2;
        Object object2 = "gcm.n.title";
        this.title = string2 = ((NotificationParams)object).getString((String)object2);
        this.titleLocKey = string2 = ((NotificationParams)object).getLocalizationResourceForKey((String)object2);
        object2 = RemoteMessage$Notification.getLocalizationArgs((NotificationParams)object, (String)object2);
        this.titleLocArgs = object2;
        object2 = "gcm.n.body";
        this.body = string2 = ((NotificationParams)object).getString((String)object2);
        this.bodyLocKey = string2 = ((NotificationParams)object).getLocalizationResourceForKey((String)object2);
        object2 = RemoteMessage$Notification.getLocalizationArgs((NotificationParams)object, (String)object2);
        this.bodyLocArgs = object2;
        object2 = ((NotificationParams)object).getString("gcm.n.icon");
        this.icon = object2;
        object2 = ((NotificationParams)object).getSoundResourceName();
        this.sound = object2;
        object2 = ((NotificationParams)object).getString("gcm.n.tag");
        this.tag = object2;
        object2 = ((NotificationParams)object).getString("gcm.n.color");
        this.color = object2;
        object2 = ((NotificationParams)object).getString("gcm.n.click_action");
        this.clickAction = object2;
        object2 = ((NotificationParams)object).getString("gcm.n.android_channel_id");
        this.channelId = object2;
        this.link = object2 = ((NotificationParams)object).getLink();
        object2 = ((NotificationParams)object).getString("gcm.n.image");
        this.imageUrl = object2;
        object2 = ((NotificationParams)object).getString("gcm.n.ticker");
        this.ticker = object2;
        object2 = ((NotificationParams)object).getInteger("gcm.n.notification_priority");
        this.notificationPriority = object2;
        object2 = ((NotificationParams)object).getInteger("gcm.n.visibility");
        this.visibility = object2;
        object2 = ((NotificationParams)object).getInteger("gcm.n.notification_count");
        this.notificationCount = object2;
        this.sticky = bl2 = ((NotificationParams)object).getBoolean("gcm.n.sticky");
        this.localOnly = bl2 = ((NotificationParams)object).getBoolean("gcm.n.local_only");
        this.defaultSound = bl2 = ((NotificationParams)object).getBoolean("gcm.n.default_sound");
        this.defaultVibrateTimings = bl2 = ((NotificationParams)object).getBoolean("gcm.n.default_vibrate_timings");
        this.defaultLightSettings = bl2 = ((NotificationParams)object).getBoolean("gcm.n.default_light_settings");
        object2 = ((NotificationParams)object).getLong("gcm.n.event_time");
        this.eventTime = object2;
        object2 = ((NotificationParams)object).getLightSettings();
        this.lightSettings = (int[])object2;
        object = ((NotificationParams)object).getVibrateTimings();
        this.vibrateTimings = (long[])object;
    }

    public /* synthetic */ RemoteMessage$Notification(NotificationParams notificationParams, RemoteMessage$1 remoteMessage$1) {
        this(notificationParams);
    }

    private static String[] getLocalizationArgs(NotificationParams objectArray, String stringArray) {
        int n3;
        if ((objectArray = objectArray.getLocalizationArgsForKey((String)stringArray)) == null) {
            return null;
        }
        int n4 = objectArray.length;
        stringArray = new String[n4];
        for (int i3 = 0; i3 < (n3 = objectArray.length); ++i3) {
            String string2;
            stringArray[i3] = string2 = String.valueOf(objectArray[i3]);
        }
        return stringArray;
    }

    public String getBody() {
        return this.body;
    }

    public String[] getBodyLocalizationArgs() {
        return this.bodyLocArgs;
    }

    public String getBodyLocalizationKey() {
        return this.bodyLocKey;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public String getClickAction() {
        return this.clickAction;
    }

    public String getColor() {
        return this.color;
    }

    public boolean getDefaultLightSettings() {
        return this.defaultLightSettings;
    }

    public boolean getDefaultSound() {
        return this.defaultSound;
    }

    public boolean getDefaultVibrateSettings() {
        return this.defaultVibrateTimings;
    }

    public Long getEventTime() {
        return this.eventTime;
    }

    public String getIcon() {
        return this.icon;
    }

    public Uri getImageUrl() {
        String string2 = this.imageUrl;
        string2 = string2 != null ? Uri.parse((String)string2) : null;
        return string2;
    }

    public int[] getLightSettings() {
        return this.lightSettings;
    }

    public Uri getLink() {
        return this.link;
    }

    public boolean getLocalOnly() {
        return this.localOnly;
    }

    public Integer getNotificationCount() {
        return this.notificationCount;
    }

    public Integer getNotificationPriority() {
        return this.notificationPriority;
    }

    public String getSound() {
        return this.sound;
    }

    public boolean getSticky() {
        return this.sticky;
    }

    public String getTag() {
        return this.tag;
    }

    public String getTicker() {
        return this.ticker;
    }

    public String getTitle() {
        return this.title;
    }

    public String[] getTitleLocalizationArgs() {
        return this.titleLocArgs;
    }

    public String getTitleLocalizationKey() {
        return this.titleLocKey;
    }

    public long[] getVibrateTimings() {
        return this.vibrateTimings;
    }

    public Integer getVisibility() {
        return this.visibility;
    }
}

