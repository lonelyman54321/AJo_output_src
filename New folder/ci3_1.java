/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ci3
 */
public final class ci3_1
extends Enum {
    private static final /* synthetic */ ci3_1[] $VALUES;
    public static final /* enum */ ci3_1 EVENTS;
    public static final /* enum */ ci3_1 INBOX_MESSAGES;
    public static final /* enum */ ci3_1 PROFILE_EVENTS;
    public static final /* enum */ ci3_1 PUSH_NOTIFICATIONS;
    public static final /* enum */ ci3_1 PUSH_NOTIFICATION_VIEWED;
    public static final /* enum */ ci3_1 UNINSTALL_TS;
    public static final /* enum */ ci3_1 USER_EVENT_LOGS_TABLE;
    public static final /* enum */ ci3_1 USER_PROFILES;
    private final String tableName;

    private static final /* synthetic */ ci3_1[] $values() {
        ci3_1 ci3_12 = EVENTS;
        ci3_12 = PROFILE_EVENTS;
        ci3_12 = USER_PROFILES;
        ci3_12 = INBOX_MESSAGES;
        ci3_12 = PUSH_NOTIFICATIONS;
        ci3_12 = UNINSTALL_TS;
        ci3_12 = PUSH_NOTIFICATION_VIEWED;
        ci3_12 = USER_EVENT_LOGS_TABLE;
        ci3_1[] ci3_1Array = new ci3_1[]{ci3_12, ci3_12, ci3_12, ci3_12, ci3_12, ci3_12, ci3_12, ci3_12};
        return ci3_1Array;
    }

    static {
        ci3_1 ci3_12;
        EVENTS = ci3_12 = new ci3_1("EVENTS", 0, "events");
        PROFILE_EVENTS = ci3_12 = new ci3_1("PROFILE_EVENTS", 1, "profileEvents");
        USER_PROFILES = ci3_12 = new ci3_1("USER_PROFILES", 2, "userProfiles");
        INBOX_MESSAGES = ci3_12 = new ci3_1("INBOX_MESSAGES", 3, "inboxMessages");
        PUSH_NOTIFICATIONS = ci3_12 = new ci3_1("PUSH_NOTIFICATIONS", 4, "pushNotifications");
        UNINSTALL_TS = ci3_12 = new ci3_1("UNINSTALL_TS", 5, "uninstallTimestamp");
        PUSH_NOTIFICATION_VIEWED = ci3_12 = new ci3_1("PUSH_NOTIFICATION_VIEWED", 6, "notificationViewed");
        USER_EVENT_LOGS_TABLE = ci3_12 = new ci3_1("USER_EVENT_LOGS_TABLE", 7, "userEventLogs");
        $VALUES = ci3_1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ci3_1() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.tableName = var3_2;
    }

    public static ci3_1 valueOf(String string2) {
        return Enum.valueOf(ci3_1.class, string2);
    }

    public static ci3_1[] values() {
        return (ci3_1[])$VALUES.clone();
    }

    public final String getTableName() {
        return this.tableName;
    }
}

