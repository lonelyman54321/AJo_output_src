/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.os.Bundle
 *  android.widget.RemoteViews
 */
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.clevertap.android.pushtemplates.R$id;
import com.clevertap.android.pushtemplates.R$layout;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mO0
 */
public final class mo0_1
extends ze3_0 {
    public uj3_1 b;
    public Bundle c;
    public q70_0 d;
    public q70_0 e;

    public final RemoteViews b(Context context, uj3_1 object) {
        int n3;
        Object object2;
        int n4;
        int n7;
        int n8;
        int n10;
        int n14;
        ko0_0 ko0_02;
        int n15;
        Object object3;
        Object object4;
        block36: {
            block35: {
                object4 = "context";
                Intrinsics.checkNotNullParameter(context, (String)object4);
                object3 = "renderer";
                Intrinsics.checkNotNullParameter(object, (String)object3);
                Intrinsics.checkNotNullParameter(context, (String)object4);
                Intrinsics.checkNotNullParameter(object, (String)object3);
                object4 = this.c;
                Intrinsics.checkNotNullParameter(object4, "extras");
                n15 = R$layout.five_cta_expanded;
                ko0_02 = new q70_0(n15, (uj3_1)object, context);
                object3 = ((uj3_1)object).c;
                if (object3 == null) break block35;
                Intrinsics.checkNotNull(object3);
                n15 = ((String)object3).length();
                if (n15 != 0) break block36;
            }
            object3 = xz3_0.e(context);
            ((uj3_1)object).c = object3;
        }
        object3 = ((uj3_1)object).r;
        ko0_02.c((String)object3);
        object3 = ((uj3_1)object).k;
        Intrinsics.checkNotNull(object3);
        n15 = ((ArrayList)object3).size();
        Object object5 = null;
        int n16 = 0;
        String string2 = null;
        while (true) {
            RemoteViews remoteViews;
            RemoteViews remoteViews2;
            n14 = 1;
            n10 = 4;
            n8 = 3;
            n7 = 2;
            if (n16 >= n15) break;
            n4 = 8;
            if (n16 != 0) {
                RemoteViews remoteViews3;
                if (n16 != n14) {
                    if (n16 != n7) {
                        if (n16 != n8) {
                            if (n16 == n10) {
                                remoteViews2 = ko0_02.c;
                                n8 = R$id.cta5;
                                remoteViews2.setViewVisibility(n8, 0);
                                n10 = R$id.cta5;
                                object2 = ((uj3_1)object).k;
                                Intrinsics.checkNotNull(object2);
                                object2 = (String)((ArrayList)object2).get(n16);
                                remoteViews = ko0_02.c;
                                xz3_0.p(n10, (String)object2, remoteViews, context);
                                n10 = (int)(Xv2.c ? 1 : 0);
                                if (n10 != 0) {
                                    ko0_02.d = n10 = ko0_02.d + n14;
                                    remoteViews3 = ko0_02.c;
                                    n10 = R$id.cta5;
                                    remoteViews3.setViewVisibility(n10, n4);
                                }
                            }
                        } else {
                            remoteViews2 = ko0_02.c;
                            n8 = R$id.cta4;
                            remoteViews2.setViewVisibility(n8, 0);
                            n10 = R$id.cta4;
                            object2 = ((uj3_1)object).k;
                            Intrinsics.checkNotNull(object2);
                            object2 = (String)((ArrayList)object2).get(n16);
                            remoteViews = ko0_02.c;
                            xz3_0.p(n10, (String)object2, remoteViews, context);
                            n10 = (int)(Xv2.c ? 1 : 0);
                            if (n10 != 0) {
                                ko0_02.d = n10 = ko0_02.d + n14;
                                remoteViews3 = ko0_02.c;
                                n10 = R$id.cta4;
                                remoteViews3.setViewVisibility(n10, n4);
                            }
                        }
                    } else {
                        remoteViews2 = ko0_02.c;
                        n8 = R$id.cta3;
                        remoteViews2.setViewVisibility(n8, 0);
                        n10 = R$id.cta3;
                        object2 = ((uj3_1)object).k;
                        Intrinsics.checkNotNull(object2);
                        object2 = (String)((ArrayList)object2).get(n16);
                        remoteViews = ko0_02.c;
                        xz3_0.p(n10, (String)object2, remoteViews, context);
                        n10 = (int)(Xv2.c ? 1 : 0);
                        if (n10 != 0) {
                            ko0_02.d = n10 = ko0_02.d + n14;
                            remoteViews3 = ko0_02.c;
                            n10 = R$id.cta3;
                            remoteViews3.setViewVisibility(n10, n4);
                        }
                    }
                } else {
                    remoteViews2 = ko0_02.c;
                    n8 = R$id.cta2;
                    remoteViews2.setViewVisibility(n8, 0);
                    n10 = R$id.cta2;
                    object2 = ((uj3_1)object).k;
                    Intrinsics.checkNotNull(object2);
                    object2 = (String)((ArrayList)object2).get(n16);
                    remoteViews = ko0_02.c;
                    xz3_0.p(n10, (String)object2, remoteViews, context);
                    n10 = (int)(Xv2.c ? 1 : 0);
                    if (n10 != 0) {
                        ko0_02.d = n10 = ko0_02.d + n14;
                        remoteViews3 = ko0_02.c;
                        n10 = R$id.cta2;
                        remoteViews3.setViewVisibility(n10, n4);
                    }
                }
            } else {
                remoteViews2 = ko0_02.c;
                n8 = R$id.cta1;
                remoteViews2.setViewVisibility(n8, 0);
                n10 = R$id.cta1;
                object2 = ((uj3_1)object).k;
                Intrinsics.checkNotNull(object2);
                object2 = (String)((ArrayList)object2).get(n16);
                remoteViews = ko0_02.c;
                xz3_0.p(n10, (String)object2, remoteViews, context);
                n10 = (int)(Xv2.c ? 1 : 0);
                if (n10 != 0) {
                    remoteViews2 = ko0_02.c;
                    n8 = R$id.cta1;
                    remoteViews2.setViewVisibility(n8, n4);
                    ko0_02.d = n10 = ko0_02.d + n14;
                }
            }
            ++n16;
        }
        n15 = ((uj3_1)object).Q;
        object4.putInt("notificationId", n15);
        object4.putBoolean("close_system_dialogs", n14 != 0);
        object3 = object4.clone();
        string2 = "null cannot be cast to non-null type android.os.Bundle";
        Intrinsics.checkNotNull(object3, string2);
        object3 = (Bundle)object3;
        object3.putBoolean("cta1", n14 != 0);
        Object object6 = ((uj3_1)object).l;
        Object object7 = null;
        if (object6 != null) {
            object6 = (String)((ArrayList)object6).get(0);
        } else {
            n4 = 0;
            object6 = null;
        }
        String string3 = "wzrk_dl";
        object3.putString(string3, (String)object6);
        object6 = new StringBuilder("5cta_1_");
        Object object8 = ((uj3_1)object).l;
        object5 = object8 != null ? (String)((ArrayList)object8).get(0) : null;
        ((StringBuilder)object6).append((String)object5);
        object5 = ((StringBuilder)object6).toString();
        object6 = "wzrk_c2a";
        object3.putString((String)object6, (String)object5);
        object5 = ko0_02.c;
        int n17 = R$id.cta1;
        object3 = np1_2.b(context, (Bundle)object3);
        object5.setOnClickPendingIntent(n17, (PendingIntent)object3);
        object3 = object4.clone();
        Intrinsics.checkNotNull(object3, string2);
        object3 = (Bundle)object3;
        object3.putBoolean("cta2", n14 != 0);
        object5 = ((uj3_1)object).l;
        object5 = object5 != null ? (String)((ArrayList)object5).get(n14) : null;
        object3.putString(string3, (String)object5);
        object5 = new StringBuilder("5cta_2_");
        object8 = ((uj3_1)object).l;
        if (object8 != null) {
            object8 = (String)((ArrayList)object8).get(n14);
        } else {
            n17 = 0;
            object8 = null;
        }
        ((StringBuilder)object5).append((String)object8);
        object5 = ((StringBuilder)object5).toString();
        object3.putString((String)object6, (String)object5);
        object5 = ko0_02.c;
        n17 = R$id.cta2;
        object3 = np1_2.b(context, (Bundle)object3);
        object5.setOnClickPendingIntent(n17, (PendingIntent)object3);
        object3 = object4.clone();
        Intrinsics.checkNotNull(object3, string2);
        object3 = (Bundle)object3;
        object3.putBoolean("cta3", n14 != 0);
        object5 = ((uj3_1)object).l;
        object5 = object5 != null ? (String)((ArrayList)object5).get(n7) : null;
        object3.putString(string3, (String)object5);
        object5 = new StringBuilder("5cta_3_");
        object8 = ((uj3_1)object).l;
        if (object8 != null) {
            object8 = (String)((ArrayList)object8).get(n7);
        } else {
            n17 = 0;
            object8 = null;
        }
        ((StringBuilder)object5).append((String)object8);
        object5 = ((StringBuilder)object5).toString();
        object3.putString((String)object6, (String)object5);
        object5 = ko0_02.c;
        n17 = R$id.cta3;
        object3 = np1_2.b(context, (Bundle)object3);
        object5.setOnClickPendingIntent(n17, (PendingIntent)object3);
        object3 = ((uj3_1)object).l;
        if (object3 != null) {
            Intrinsics.checkNotNull(object3);
            n15 = ((ArrayList)object3).size();
            if (n15 > n8) {
                object3 = object4.clone();
                Intrinsics.checkNotNull(object3, string2);
                object3 = (Bundle)object3;
                object3.putBoolean("cta4", n14 != 0);
                object5 = ((uj3_1)object).l;
                object5 = object5 != null ? (String)((ArrayList)object5).get(n8) : null;
                object3.putString(string3, (String)object5);
                object5 = new StringBuilder("5cta_4_");
                object8 = ((uj3_1)object).l;
                if (object8 != null) {
                    object2 = (String)((ArrayList)object8).get(n8);
                } else {
                    n8 = 0;
                    object2 = null;
                }
                ((StringBuilder)object5).append((String)object2);
                object5 = ((StringBuilder)object5).toString();
                object3.putString((String)object6, (String)object5);
                object5 = ko0_02.c;
                n8 = R$id.cta4;
                object3 = np1_2.b(context, (Bundle)object3);
                object5.setOnClickPendingIntent(n8, (PendingIntent)object3);
            }
        }
        if ((object3 = ((uj3_1)object).l) != null) {
            Intrinsics.checkNotNull(object3);
            n15 = ((ArrayList)object3).size();
            if (n15 > n10) {
                object4 = object4.clone();
                Intrinsics.checkNotNull(object4, string2);
                object4 = (Bundle)object4;
                object4.putBoolean("cta5", n14 != 0);
                object3 = ((uj3_1)object).l;
                if (object3 != null) {
                    object3 = (String)((ArrayList)object3).get(n10);
                } else {
                    n15 = 0;
                    object3 = null;
                }
                object4.putString(string3, (String)object3);
                object5 = "5cta_5_";
                object3 = new StringBuilder((String)object5);
                object = ((uj3_1)object).l;
                if (object != null) {
                    object7 = object = ((ArrayList)object).get(n10);
                    object7 = (String)object;
                }
                ((StringBuilder)object3).append((String)object7);
                object = ((StringBuilder)object3).toString();
                object4.putString((String)object6, (String)object);
                object = ko0_02.c;
                n15 = R$id.cta5;
                context = np1_2.b(context, (Bundle)object4);
                object.setOnClickPendingIntent(n15, (PendingIntent)context);
            }
        }
        if ((n3 = ko0_02.d) > n7) {
            ak2_1.a();
        }
        Intrinsics.checkNotNullParameter(ko0_02, "<set-?>");
        this.e = ko0_02;
        return ko0_02.c;
    }

    public final PendingIntent c(Context context, Bundle bundle, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "extras");
        return null;
    }

    public final PendingIntent d(Context context, Bundle bundle, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "extras");
        uj3_1 uj3_12 = this.b;
        return sq2_1.b(context, n3, bundle, true, 13, uj3_12);
    }

    public final RemoteViews e(Context context, uj3_1 object) {
        int n3;
        Object object2;
        int n4;
        int n7;
        int n8;
        int n10;
        int n14;
        lo0_0 lo0_02;
        int n15;
        Object object3;
        Object object4;
        block36: {
            block35: {
                object4 = "context";
                Intrinsics.checkNotNullParameter(context, (String)object4);
                object3 = "renderer";
                Intrinsics.checkNotNullParameter(object, (String)object3);
                Intrinsics.checkNotNullParameter(context, (String)object4);
                Intrinsics.checkNotNullParameter(object, (String)object3);
                object4 = this.c;
                Intrinsics.checkNotNullParameter(object4, "extras");
                n15 = R$layout.five_cta_collapsed;
                lo0_02 = new q70_0(n15, (uj3_1)object, context);
                object3 = ((uj3_1)object).c;
                if (object3 == null) break block35;
                Intrinsics.checkNotNull(object3);
                n15 = ((String)object3).length();
                if (n15 != 0) break block36;
            }
            object3 = xz3_0.e(context);
            ((uj3_1)object).c = object3;
        }
        object3 = ((uj3_1)object).r;
        lo0_02.c((String)object3);
        object3 = ((uj3_1)object).k;
        Intrinsics.checkNotNull(object3);
        n15 = ((ArrayList)object3).size();
        Object object5 = null;
        int n16 = 0;
        String string2 = null;
        while (true) {
            RemoteViews remoteViews;
            RemoteViews remoteViews2;
            n14 = 1;
            n10 = 4;
            n8 = 3;
            n7 = 2;
            if (n16 >= n15) break;
            n4 = 8;
            if (n16 != 0) {
                RemoteViews remoteViews3;
                if (n16 != n14) {
                    if (n16 != n7) {
                        if (n16 != n8) {
                            if (n16 == n10) {
                                remoteViews2 = lo0_02.c;
                                n8 = R$id.cta5;
                                remoteViews2.setViewVisibility(n8, 0);
                                n10 = R$id.cta5;
                                object2 = ((uj3_1)object).k;
                                Intrinsics.checkNotNull(object2);
                                object2 = (String)((ArrayList)object2).get(n16);
                                remoteViews = lo0_02.c;
                                xz3_0.p(n10, (String)object2, remoteViews, context);
                                n10 = (int)(Xv2.c ? 1 : 0);
                                if (n10 != 0) {
                                    lo0_02.d = n10 = lo0_02.d + n14;
                                    remoteViews3 = lo0_02.c;
                                    n10 = R$id.cta5;
                                    remoteViews3.setViewVisibility(n10, n4);
                                }
                            }
                        } else {
                            remoteViews2 = lo0_02.c;
                            n8 = R$id.cta4;
                            remoteViews2.setViewVisibility(n8, 0);
                            n10 = R$id.cta4;
                            object2 = ((uj3_1)object).k;
                            Intrinsics.checkNotNull(object2);
                            object2 = (String)((ArrayList)object2).get(n16);
                            remoteViews = lo0_02.c;
                            xz3_0.p(n10, (String)object2, remoteViews, context);
                            n10 = (int)(Xv2.c ? 1 : 0);
                            if (n10 != 0) {
                                lo0_02.d = n10 = lo0_02.d + n14;
                                remoteViews3 = lo0_02.c;
                                n10 = R$id.cta4;
                                remoteViews3.setViewVisibility(n10, n4);
                            }
                        }
                    } else {
                        remoteViews2 = lo0_02.c;
                        n8 = R$id.cta3;
                        remoteViews2.setViewVisibility(n8, 0);
                        n10 = R$id.cta3;
                        object2 = ((uj3_1)object).k;
                        Intrinsics.checkNotNull(object2);
                        object2 = (String)((ArrayList)object2).get(n16);
                        remoteViews = lo0_02.c;
                        xz3_0.p(n10, (String)object2, remoteViews, context);
                        n10 = (int)(Xv2.c ? 1 : 0);
                        if (n10 != 0) {
                            lo0_02.d = n10 = lo0_02.d + n14;
                            remoteViews3 = lo0_02.c;
                            n10 = R$id.cta3;
                            remoteViews3.setViewVisibility(n10, n4);
                        }
                    }
                } else {
                    remoteViews2 = lo0_02.c;
                    n8 = R$id.cta2;
                    remoteViews2.setViewVisibility(n8, 0);
                    n10 = R$id.cta2;
                    object2 = ((uj3_1)object).k;
                    Intrinsics.checkNotNull(object2);
                    object2 = (String)((ArrayList)object2).get(n16);
                    remoteViews = lo0_02.c;
                    xz3_0.p(n10, (String)object2, remoteViews, context);
                    n10 = (int)(Xv2.c ? 1 : 0);
                    if (n10 != 0) {
                        lo0_02.d = n10 = lo0_02.d + n14;
                        remoteViews3 = lo0_02.c;
                        n10 = R$id.cta2;
                        remoteViews3.setViewVisibility(n10, n4);
                    }
                }
            } else {
                remoteViews2 = lo0_02.c;
                n8 = R$id.cta1;
                remoteViews2.setViewVisibility(n8, 0);
                n10 = R$id.cta1;
                object2 = ((uj3_1)object).k;
                Intrinsics.checkNotNull(object2);
                object2 = (String)((ArrayList)object2).get(n16);
                remoteViews = lo0_02.c;
                xz3_0.p(n10, (String)object2, remoteViews, context);
                n10 = (int)(Xv2.c ? 1 : 0);
                if (n10 != 0) {
                    remoteViews2 = lo0_02.c;
                    n8 = R$id.cta1;
                    remoteViews2.setViewVisibility(n8, n4);
                    lo0_02.d = n10 = lo0_02.d + n14;
                }
            }
            ++n16;
        }
        n15 = ((uj3_1)object).Q;
        object4.putInt("notificationId", n15);
        object4.putBoolean("close_system_dialogs", n14 != 0);
        object3 = object4.clone();
        string2 = "null cannot be cast to non-null type android.os.Bundle";
        Intrinsics.checkNotNull(object3, string2);
        object3 = (Bundle)object3;
        object3.putBoolean("cta1", n14 != 0);
        Object object6 = ((uj3_1)object).l;
        Object object7 = null;
        if (object6 != null) {
            object6 = (String)((ArrayList)object6).get(0);
        } else {
            n4 = 0;
            object6 = null;
        }
        String string3 = "wzrk_dl";
        object3.putString(string3, (String)object6);
        object6 = new StringBuilder("5cta_1_");
        Object object8 = ((uj3_1)object).l;
        object5 = object8 != null ? (String)((ArrayList)object8).get(0) : null;
        ((StringBuilder)object6).append((String)object5);
        object5 = ((StringBuilder)object6).toString();
        object6 = "wzrk_c2a";
        object3.putString((String)object6, (String)object5);
        object5 = lo0_02.c;
        int n17 = R$id.cta1;
        object3 = np1_2.b(context, (Bundle)object3);
        object5.setOnClickPendingIntent(n17, (PendingIntent)object3);
        object3 = object4.clone();
        Intrinsics.checkNotNull(object3, string2);
        object3 = (Bundle)object3;
        object3.putBoolean("cta2", n14 != 0);
        object5 = ((uj3_1)object).l;
        object5 = object5 != null ? (String)((ArrayList)object5).get(n14) : null;
        object3.putString(string3, (String)object5);
        object5 = new StringBuilder("5cta_2_");
        object8 = ((uj3_1)object).l;
        if (object8 != null) {
            object8 = (String)((ArrayList)object8).get(n14);
        } else {
            n17 = 0;
            object8 = null;
        }
        ((StringBuilder)object5).append((String)object8);
        object5 = ((StringBuilder)object5).toString();
        object3.putString((String)object6, (String)object5);
        object5 = lo0_02.c;
        n17 = R$id.cta2;
        object3 = np1_2.b(context, (Bundle)object3);
        object5.setOnClickPendingIntent(n17, (PendingIntent)object3);
        object3 = object4.clone();
        Intrinsics.checkNotNull(object3, string2);
        object3 = (Bundle)object3;
        object3.putBoolean("cta3", n14 != 0);
        object5 = ((uj3_1)object).l;
        object5 = object5 != null ? (String)((ArrayList)object5).get(n7) : null;
        object3.putString(string3, (String)object5);
        object5 = new StringBuilder("5cta_3_");
        object8 = ((uj3_1)object).l;
        if (object8 != null) {
            object8 = (String)((ArrayList)object8).get(n7);
        } else {
            n17 = 0;
            object8 = null;
        }
        ((StringBuilder)object5).append((String)object8);
        object5 = ((StringBuilder)object5).toString();
        object3.putString((String)object6, (String)object5);
        object5 = lo0_02.c;
        n17 = R$id.cta3;
        object3 = np1_2.b(context, (Bundle)object3);
        object5.setOnClickPendingIntent(n17, (PendingIntent)object3);
        object3 = ((uj3_1)object).l;
        if (object3 != null) {
            Intrinsics.checkNotNull(object3);
            n15 = ((ArrayList)object3).size();
            if (n15 > n8) {
                object3 = object4.clone();
                Intrinsics.checkNotNull(object3, string2);
                object3 = (Bundle)object3;
                object3.putBoolean("cta4", n14 != 0);
                object5 = ((uj3_1)object).l;
                object5 = object5 != null ? (String)((ArrayList)object5).get(n8) : null;
                object3.putString(string3, (String)object5);
                object5 = new StringBuilder("5cta_4_");
                object8 = ((uj3_1)object).l;
                if (object8 != null) {
                    object2 = (String)((ArrayList)object8).get(n8);
                } else {
                    n8 = 0;
                    object2 = null;
                }
                ((StringBuilder)object5).append((String)object2);
                object5 = ((StringBuilder)object5).toString();
                object3.putString((String)object6, (String)object5);
                object5 = lo0_02.c;
                n8 = R$id.cta4;
                object3 = np1_2.b(context, (Bundle)object3);
                object5.setOnClickPendingIntent(n8, (PendingIntent)object3);
            }
        }
        if ((object3 = ((uj3_1)object).l) != null) {
            Intrinsics.checkNotNull(object3);
            n15 = ((ArrayList)object3).size();
            if (n15 > n10) {
                object4 = object4.clone();
                Intrinsics.checkNotNull(object4, string2);
                object4 = (Bundle)object4;
                object4.putBoolean("cta5", n14 != 0);
                object3 = ((uj3_1)object).l;
                if (object3 != null) {
                    object3 = (String)((ArrayList)object3).get(n10);
                } else {
                    n15 = 0;
                    object3 = null;
                }
                object4.putString(string3, (String)object3);
                object5 = "5cta_5_";
                object3 = new StringBuilder((String)object5);
                object = ((uj3_1)object).l;
                if (object != null) {
                    object7 = object = ((ArrayList)object).get(n10);
                    object7 = (String)object;
                }
                ((StringBuilder)object3).append((String)object7);
                object = ((StringBuilder)object3).toString();
                object4.putString((String)object6, (String)object);
                object = lo0_02.c;
                n15 = R$id.cta5;
                context = np1_2.b(context, (Bundle)object4);
                object.setOnClickPendingIntent(n15, (PendingIntent)context);
            }
        }
        if ((n3 = lo0_02.d) > n7) {
            ak2_1.a();
        }
        Intrinsics.checkNotNullParameter(lo0_02, "<set-?>");
        this.d = lo0_02;
        return lo0_02.c;
    }
}

