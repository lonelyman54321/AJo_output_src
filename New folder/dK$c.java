/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.FacebookSdk;

public final class dK$c
extends Enum {
    private static final /* synthetic */ dK$c[] $VALUES;
    public static final /* enum */ dK$c AppGroupCreate;
    public static final /* enum */ dK$c AppGroupJoin;
    public static final /* enum */ dK$c AppInvite;
    public static final /* enum */ dK$c DeviceShare;
    public static final /* enum */ dK$c GameRequest;
    public static final /* enum */ dK$c GamingContextChoose;
    public static final /* enum */ dK$c GamingContextCreate;
    public static final /* enum */ dK$c GamingContextSwitch;
    public static final /* enum */ dK$c GamingFriendFinder;
    public static final /* enum */ dK$c GamingGroupIntegration;
    public static final /* enum */ dK$c Like;
    public static final /* enum */ dK$c Login;
    public static final /* enum */ dK$c Message;
    public static final /* enum */ dK$c Referral;
    public static final /* enum */ dK$c Share;
    public static final /* enum */ dK$c TournamentJoinDialog;
    public static final /* enum */ dK$c TournamentShareDialog;
    private final int offset;

    private static final /* synthetic */ dK$c[] $values() {
        dK$c dK$c = Login;
        dK$c = Share;
        dK$c = Message;
        dK$c = Like;
        dK$c = GameRequest;
        dK$c = AppGroupCreate;
        dK$c = AppGroupJoin;
        dK$c = AppInvite;
        dK$c = DeviceShare;
        dK$c = GamingFriendFinder;
        dK$c = GamingGroupIntegration;
        dK$c = Referral;
        dK$c = GamingContextCreate;
        dK$c = GamingContextSwitch;
        dK$c = GamingContextChoose;
        dK$c = TournamentShareDialog;
        dK$c = TournamentJoinDialog;
        dK$c[] dK$cArray = new dK$c[]{dK$c, dK$c, dK$c, dK$c, dK$c, dK$c, dK$c, dK$c, dK$c, dK$c, dK$c, dK$c, dK$c, dK$c, dK$c, dK$c, dK$c};
        return dK$cArray;
    }

    static {
        dK$c dK$c;
        Login = dK$c = new dK$c("Login", 0, 0);
        int n3 = 1;
        Share = dK$c = new dK$c("Share", n3, n3);
        n3 = 2;
        Message = dK$c = new dK$c("Message", n3, n3);
        n3 = 3;
        Like = dK$c = new dK$c("Like", n3, n3);
        n3 = 4;
        GameRequest = dK$c = new dK$c("GameRequest", n3, n3);
        n3 = 5;
        AppGroupCreate = dK$c = new dK$c("AppGroupCreate", n3, n3);
        n3 = 6;
        AppGroupJoin = dK$c = new dK$c("AppGroupJoin", n3, n3);
        n3 = 7;
        AppInvite = dK$c = new dK$c("AppInvite", n3, n3);
        n3 = 8;
        DeviceShare = dK$c = new dK$c("DeviceShare", n3, n3);
        n3 = 9;
        GamingFriendFinder = dK$c = new dK$c("GamingFriendFinder", n3, n3);
        n3 = 10;
        GamingGroupIntegration = dK$c = new dK$c("GamingGroupIntegration", n3, n3);
        n3 = 11;
        Referral = dK$c = new dK$c("Referral", n3, n3);
        n3 = 12;
        GamingContextCreate = dK$c = new dK$c("GamingContextCreate", n3, n3);
        n3 = 13;
        GamingContextSwitch = dK$c = new dK$c("GamingContextSwitch", n3, n3);
        n3 = 14;
        GamingContextChoose = dK$c = new dK$c("GamingContextChoose", n3, n3);
        n3 = 15;
        TournamentShareDialog = dK$c = new dK$c("TournamentShareDialog", n3, n3);
        n3 = 16;
        TournamentJoinDialog = dK$c = new dK$c("TournamentJoinDialog", n3, n3);
        $VALUES = dK$c.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dK$c() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.offset = var3_2;
    }

    public static dK$c valueOf(String string2) {
        return Enum.valueOf(dK$c.class, string2);
    }

    public static dK$c[] values() {
        return (dK$c[])$VALUES.clone();
    }

    public final int toRequestCode() {
        Xz3.h();
        int n3 = FacebookSdk.l;
        int n4 = this.offset;
        return n3 + n4;
    }
}

