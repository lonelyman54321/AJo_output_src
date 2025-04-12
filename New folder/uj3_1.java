/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.NotificationManager
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.media.RingtoneManager
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.service.notification.StatusBarNotification
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.service.notification.StatusBarNotification;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from uj3
 */
public final class uj3_1
implements ec1_1,
ar_1 {
    public static final /* synthetic */ int R;
    public final int A;
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public final String F;
    public final String G;
    public final String H;
    public Bitmap I;
    public final String J;
    public final ArrayList K;
    public final JSONArray L;
    public final String M;
    public final int N;
    public final Object O;
    public final String P;
    public int Q;
    public final String a;
    public final vj3_2 b;
    public String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final ArrayList k;
    public final ArrayList l;
    public final ArrayList m;
    public final ArrayList n;
    public final ArrayList o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public int u;
    public final int v;
    public final String w;
    public final String x;
    public final String y;
    public final String z;

    static {
        uj3$a.INFO.intValue();
    }

    public uj3_1(Context object, Bundle bundle) {
        block78: {
            Object object2;
            block77: {
                int n3;
                block76: {
                    block75: {
                        block74: {
                            block73: {
                                block72: {
                                    block71: {
                                        block70: {
                                            block69: {
                                                block68: {
                                                    block67: {
                                                        block66: {
                                                            block65: {
                                                                block64: {
                                                                    block63: {
                                                                        block62: {
                                                                            block61: {
                                                                                int n4;
                                                                                int n7;
                                                                                Object object3;
                                                                                String string2;
                                                                                int n8;
                                                                                int n10;
                                                                                Object object4;
                                                                                int n14;
                                                                                Intrinsics.checkNotNullParameter(object, "context");
                                                                                Intrinsics.checkNotNullParameter(bundle, "extras");
                                                                                this.Q = n14 = -1;
                                                                                object2 = bundle.getString("pt_id");
                                                                                this.a = object2;
                                                                                object2 = bundle.getString("pt_json");
                                                                                StatusBarNotification[] statusBarNotificationArray = this.a;
                                                                                JSONArray jSONArray = null;
                                                                                if (statusBarNotificationArray != null) {
                                                                                    block60: {
                                                                                        block59: {
                                                                                            object4 = vj3_2.Companion;
                                                                                            object4.getClass();
                                                                                            statusBarNotificationArray = vj3$a.a((String)statusBarNotificationArray);
                                                                                            this.b = statusBarNotificationArray;
                                                                                            if (object2 != null) {
                                                                                                try {
                                                                                                    n10 = object2.length();
                                                                                                    if (n10 <= 0) break block59;
                                                                                                }
                                                                                                catch (JSONException jSONException) {}
                                                                                                super((String)object2);
                                                                                                object2 = xz3_0.d((JSONObject)statusBarNotificationArray);
                                                                                                break block60;
                                                                                            }
                                                                                        }
                                                                                        n14 = 0;
                                                                                        object2 = null;
                                                                                    }
                                                                                    if (object2 != null) {
                                                                                        bundle.putAll((Bundle)object2);
                                                                                    }
                                                                                }
                                                                                object2 = bundle.getString("pt_msg");
                                                                                this.d = object2;
                                                                                object2 = bundle.getString("pt_msg_summary");
                                                                                this.e = object2;
                                                                                object2 = bundle.getString("pt_msg_clr");
                                                                                this.i = object2;
                                                                                object2 = bundle.getString("pt_title");
                                                                                this.c = object2;
                                                                                object2 = bundle.getString("pt_title_clr");
                                                                                this.h = object2;
                                                                                object2 = bundle.getString("pt_meta_clr");
                                                                                this.F = object2;
                                                                                object2 = bundle.getString("pt_bg");
                                                                                this.r = object2;
                                                                                object2 = bundle.getString("pt_big_img");
                                                                                this.g = object2;
                                                                                object2 = bundle.getString("pt_ico");
                                                                                this.f = object2;
                                                                                object2 = bundle.getString("pt_small_view");
                                                                                this.t = object2;
                                                                                object2 = xz3_0.k(bundle);
                                                                                this.k = object2;
                                                                                object2 = xz3_0.i(bundle);
                                                                                this.l = object2;
                                                                                object2 = xz3_0.f(bundle);
                                                                                this.m = object2;
                                                                                object2 = xz3_0.o(bundle);
                                                                                this.n = object2;
                                                                                object2 = xz3_0.n(bundle);
                                                                                this.o = object2;
                                                                                object2 = bundle.getString("pt_default_dl");
                                                                                this.s = object2;
                                                                                object2 = bundle.keySet().iterator();
                                                                                statusBarNotificationArray = "-1";
                                                                                object4 = statusBarNotificationArray;
                                                                                while ((n8 = object2.hasNext()) != 0) {
                                                                                    string2 = (String)object2.next();
                                                                                    n7 = string2.contains((CharSequence)(object3 = "pt_timer_threshold"));
                                                                                    if (n7 == 0) continue;
                                                                                    object4 = bundle.getString(string2);
                                                                                }
                                                                                if (object4 == null) {
                                                                                    object4 = statusBarNotificationArray;
                                                                                }
                                                                                this.v = n14 = Integer.parseInt((String)object4);
                                                                                object2 = bundle.getString("pt_input_label");
                                                                                this.w = object2;
                                                                                object2 = bundle.getString("pt_input_feedback");
                                                                                this.x = object2;
                                                                                object2 = bundle.getString("pt_input_auto_open");
                                                                                this.y = object2;
                                                                                object2 = bundle.getString("pt_dismiss_on_click");
                                                                                this.z = object2;
                                                                                object2 = bundle.getString("pt_chrono_title_clr");
                                                                                this.j = object2;
                                                                                object2 = bundle.getString("pt_product_display_action");
                                                                                this.p = object2;
                                                                                object2 = bundle.getString("pt_product_display_action_clr");
                                                                                this.q = object2;
                                                                                object2 = bundle.keySet().iterator();
                                                                                object4 = statusBarNotificationArray;
                                                                                while ((n8 = object2.hasNext()) != 0) {
                                                                                    string2 = (String)object2.next();
                                                                                    n7 = string2.contains((CharSequence)(object3 = "pt_timer_end"));
                                                                                    if (n7 == 0) continue;
                                                                                    object4 = bundle.getString(string2);
                                                                                }
                                                                                object2 = "$D_";
                                                                                n14 = (int)(((String)object4).contains((CharSequence)object2) ? 1 : 0);
                                                                                if (n14 != 0) {
                                                                                    object2 = ((String)object4).split("\\$D_");
                                                                                    n4 = 1;
                                                                                    object4 = object2[n4];
                                                                                }
                                                                                long l2 = System.currentTimeMillis();
                                                                                long l3 = Long.parseLong((String)object4);
                                                                                long l4 = 1000L;
                                                                                n14 = (int)(l3 -= (l2 /= l4));
                                                                                n10 = (int)(((String)object4).equals(statusBarNotificationArray) ? 1 : 0);
                                                                                if (n10 != 0) {
                                                                                    n14 = -1 << -1;
                                                                                }
                                                                                this.A = n14;
                                                                                object2 = bundle.getString("pt_big_img_alt");
                                                                                this.D = object2;
                                                                                object2 = bundle.getString("pt_msg_alt");
                                                                                this.C = object2;
                                                                                object2 = bundle.getString("pt_title_alt");
                                                                                this.B = object2;
                                                                                object2 = bundle.getString("pt_product_display_linear");
                                                                                this.E = object2;
                                                                                object2 = bundle.getString("pt_product_display_action_text_clr");
                                                                                this.G = object2;
                                                                                object2 = bundle.getString("pt_small_icon_clr");
                                                                                this.H = object2;
                                                                                object2 = bundle.getString("pt_cancel_notif_id");
                                                                                this.J = object2;
                                                                                super();
                                                                                n10 = Build.VERSION.SDK_INT;
                                                                                n4 = 23;
                                                                                if (n10 >= n4) {
                                                                                    statusBarNotificationArray = u42_0.a((NotificationManager)object.getSystemService("notification"));
                                                                                    n4 = statusBarNotificationArray.length;
                                                                                    string2 = null;
                                                                                    for (n8 = 0; n8 < n4; ++n8) {
                                                                                        String string3;
                                                                                        object3 = statusBarNotificationArray[n8];
                                                                                        String string4 = object3.getPackageName();
                                                                                        boolean bl2 = string4.equalsIgnoreCase(string3 = object.getPackageName());
                                                                                        if (!bl2) continue;
                                                                                        n7 = object3.getId();
                                                                                        object3 = n7;
                                                                                        object2.add(object3);
                                                                                    }
                                                                                }
                                                                                this.K = object2;
                                                                                object = bundle.getString("wzrk_acts");
                                                                                if (object != null) {
                                                                                    try {
                                                                                        jSONArray = object2 = new JSONArray((String)object);
                                                                                    }
                                                                                    catch (Throwable throwable) {
                                                                                        throwable.getLocalizedMessage();
                                                                                        ak2_1.a();
                                                                                    }
                                                                                }
                                                                                this.L = jSONArray;
                                                                                object = bundle.getString("pt_subtitle");
                                                                                this.M = object;
                                                                                this.O = object = bundle.get("pt_ck");
                                                                                object = bundle.getString("pt_flip_interval");
                                                                                n14 = 4000;
                                                                                if (object != null) {
                                                                                    n3 = Integer.parseInt((String)object);
                                                                                    try {
                                                                                        n14 = Math.max(n3, n14);
                                                                                    }
                                                                                    catch (Exception exception) {
                                                                                        ak2_1.a();
                                                                                    }
                                                                                }
                                                                                this.N = n14;
                                                                                bundle.getString("wzrk_pid");
                                                                                object = bundle.getString("pt_manual_carousel_type");
                                                                                this.P = object;
                                                                                object = this.c;
                                                                                if (object == null) break block61;
                                                                                Intrinsics.checkNotNull(object);
                                                                                n3 = ((String)object).length();
                                                                                if (n3 != 0) break block62;
                                                                            }
                                                                            this.c = object = bundle.getString("nt");
                                                                        }
                                                                        if ((object = this.d) == null) break block63;
                                                                        Intrinsics.checkNotNull(object);
                                                                        n3 = ((String)object).length();
                                                                        if (n3 != 0) break block64;
                                                                    }
                                                                    this.d = object = bundle.getString("nm");
                                                                }
                                                                if ((object = this.e) == null) break block65;
                                                                Intrinsics.checkNotNull(object);
                                                                n3 = ((String)object).length();
                                                                if (n3 != 0) break block66;
                                                            }
                                                            this.e = object = bundle.getString("wzrk_nms");
                                                        }
                                                        if ((object = this.g) == null) break block67;
                                                        Intrinsics.checkNotNull(object);
                                                        n3 = ((String)object).length();
                                                        if (n3 != 0) break block68;
                                                    }
                                                    this.g = object = bundle.getString("wzrk_bp");
                                                }
                                                if ((object = this.s) == null) break block69;
                                                Intrinsics.checkNotNull(object);
                                                n3 = ((String)object).length();
                                                if (n3 != 0) break block70;
                                            }
                                            this.s = object = bundle.getString("wzrk_dl");
                                        }
                                        object = this.F;
                                        object2 = "wzrk_clr";
                                        if (object == null) break block71;
                                        Intrinsics.checkNotNull(object);
                                        n3 = ((String)object).length();
                                        if (n3 != 0) break block72;
                                    }
                                    this.F = object = bundle.getString((String)object2);
                                }
                                if ((object = this.H) == null) break block73;
                                Intrinsics.checkNotNull(object);
                                n3 = ((String)object).length();
                                if (n3 != 0) break block74;
                            }
                            this.H = object = bundle.getString((String)object2);
                        }
                        if ((object = this.M) == null) break block75;
                        Intrinsics.checkNotNull(object);
                        n3 = ((String)object).length();
                        if (n3 != 0) break block76;
                    }
                    this.M = object = bundle.getString("wzrk_st");
                }
                if ((object = this.H) == null) break block77;
                Intrinsics.checkNotNull(object);
                n3 = ((String)object).length();
                if (n3 != 0) break block78;
            }
            this.H = object = bundle.getString((String)object2);
        }
        if ((object = this.O) == null) {
            this.O = object = bundle.get("wzrk_ck");
        }
    }

    public final String a(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "extras");
        Intrinsics.checkNotNullParameter(context, "context");
        return this.c;
    }

    public final void b(int n3, Context context) {
        String string2 = "context";
        Intrinsics.checkNotNullParameter(context, string2);
        this.u = n3;
        string2 = this.H;
        Bitmap bitmap = xz3_0.r(context, n3, string2);
        try {
            this.I = bitmap;
        }
        catch (NullPointerException nullPointerException) {
            ak2_1.a();
        }
    }

    public final Object c(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "extras");
        return this.O;
    }

    public final J42 d(Bundle object, Context object2, J42 object3, CleverTapInstanceConfig object4, int n3) {
        int n4;
        String string2 = "extras";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object2, "context");
        Intrinsics.checkNotNullParameter(object3, "nb");
        Intrinsics.checkNotNullParameter(object4, "config");
        object4 = this.a;
        Object object5 = null;
        if (object4 == null) {
            ak2_1.b();
            return null;
        }
        this.Q = n3;
        object4 = this.b;
        int n7 = -1;
        if (object4 == null) {
            n4 = -1;
        } else {
            int[] nArray = uj3$b.$EnumSwitchMapping$0;
            n4 = ((Enum)object4).ordinal();
            n4 = nArray[n4];
        }
        int n8 = 1;
        String string3 = "renderer";
        block0 : switch (n4) {
            default: {
                ak2_1.b();
                break;
            }
            case 10: {
                int n10;
                object = object2.getSystemService("notification");
                Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.app.NotificationManager");
                object = (NotificationManager)object;
                object2 = this.J;
                if (object2 != null) {
                    Intrinsics.checkNotNull(object2);
                    n10 = ((String)object2).length();
                    if (n10 > 0) {
                        object2 = this.J;
                        Intrinsics.checkNotNull(object2);
                        n10 = Integer.parseInt((String)object2);
                        object.cancel(n10);
                        break;
                    }
                }
                object2 = this.K;
                Intrinsics.checkNotNull(object2);
                n10 = ((ArrayList)object2).size();
                if (n10 <= 0) break;
                object2 = this.K;
                Intrinsics.checkNotNull(object2);
                n10 = ((ArrayList)object2).size();
                if (n10 < 0) break;
                int n14 = 0;
                object3 = null;
                while (true) {
                    object4 = this.K;
                    Intrinsics.checkNotNull(object4);
                    object4 = ((ArrayList)object4).get(n14);
                    String string4 = "get(...)";
                    Intrinsics.checkNotNullExpressionValue(object4, string4);
                    object4 = (Number)object4;
                    n4 = ((Number)object4).intValue();
                    object.cancel(n4);
                    if (n14 == n10) break block0;
                    ++n14;
                }
            }
            case 9: {
                object4 = jA3$a.a(vj3_2.INPUT_BOX, this);
                if (object4 == null || (n4 = (int)(((iA3)object4).b() ? 1 : 0)) != n8) break;
                Intrinsics.checkNotNullParameter(this, string3);
                object4 = new ze3_0(this);
                ((Gh1)object4).b = this;
                return ((Gh1)object4).a((Context)object2, (Bundle)object, n3, (J42)object3);
            }
            case 8: {
                n4 = Build.VERSION.SDK_INT;
                int n15 = 24;
                if (n4 >= n15) {
                    long l2;
                    object4 = jA3$a.a(vj3_2.TIMER, this);
                    if (object4 == null || (n4 = (int)(((iA3)object4).b() ? 1 : 0)) != n8) break;
                    n4 = this.v;
                    n8 = 10;
                    if (n4 != n7 && n4 >= n8) {
                        n4 = n4 * 1000 + 1000;
                        object4 = n4;
                    } else {
                        n4 = this.A;
                        if (n4 >= n8) {
                            n4 = n4 * 1000 + 1000;
                            object4 = n4;
                        } else {
                            ak2_1.a();
                            n4 = 0;
                            object4 = null;
                        }
                    }
                    if (object4 == null) break;
                    Object object6 = Looper.getMainLooper();
                    object5 = new Handler(object6);
                    object6 = new tj3_1(n3, this, (Context)object2, (Bundle)object);
                    long l3 = (Integer)object4 + -100;
                    object5.postDelayed((Runnable)object6, l3);
                    Intrinsics.checkNotNullParameter(this, string3);
                    Intrinsics.checkNotNullParameter(object, string2);
                    object5 = new ze3_0(this);
                    ((Jn3)object5).b = this;
                    object = ((ze3_0)object5).a((Context)object2, (Bundle)object, n3, (J42)object3);
                    object.M = l2 = (long)((Integer)object4).intValue();
                    return object;
                }
                ak2_1.a();
                object4 = jA3$a.a(vj3_2.BASIC, this);
                if (object4 == null || (n4 = (int)(((iA3)object4).b() ? 1 : 0)) != n8) break;
                object4 = new ax_0(this);
                return ((ze3_0)object4).a((Context)object2, (Bundle)object, n3, (J42)object3);
            }
            case 7: {
                object4 = jA3$a.a(vj3_2.ZERO_BEZEL, this);
                if (object4 == null || (n4 = (int)(((iA3)object4).b() ? 1 : 0)) != n8) break;
                Intrinsics.checkNotNullParameter(this, string3);
                object4 = new ze3_0(this);
                ((bj3_1)object4).b = this;
                return ((ze3_0)object4).a((Context)object2, (Bundle)object, n3, (J42)object3);
            }
            case 6: {
                object4 = jA3$a.a(vj3_2.PRODUCT_DISPLAY, this);
                if (object4 == null || (n4 = (int)(((iA3)object4).b() ? 1 : 0)) != n8) break;
                Intrinsics.checkNotNullParameter(this, string3);
                Intrinsics.checkNotNullParameter(object, string2);
                object4 = new ze3_0(this);
                ((jA2)object4).b = this;
                ((jA2)object4).c = object;
                return ((ze3_0)object4).a((Context)object2, (Bundle)object, n3, (J42)object3);
            }
            case 5: {
                int n16;
                object4 = jA3$a.a(vj3_2.FIVE_ICONS, this);
                if (object4 == null || (n4 = (int)(((iA3)object4).b() ? 1 : 0)) != n8) break;
                Intrinsics.checkNotNullParameter(this, string3);
                Intrinsics.checkNotNullParameter(object, string2);
                object4 = new ze3_0(this);
                ((mo0_1)object4).b = this;
                ((mo0_1)object4).c = object;
                object = ((ze3_0)object4).a((Context)object2, (Bundle)object, n3, (J42)object3);
                object2 = ((mo0_1)object4).d;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("fiveIconSmallContentView");
                    n16 = 0;
                    object2 = null;
                }
                object3 = "null cannot be cast to non-null type com.clevertap.android.pushtemplates.content.FiveIconSmallContentView";
                Intrinsics.checkNotNull(object2, (String)object3);
                object2 = (lo0_0)object2;
                n16 = ((lo0_0)object2).d;
                int n17 = 2;
                if (n16 <= n17) {
                    object2 = ((mo0_1)object4).e;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("fiveIconBigContentView");
                        n16 = 0;
                        object2 = null;
                    }
                    object4 = "null cannot be cast to non-null type com.clevertap.android.pushtemplates.content.FiveIconBigContentView";
                    Intrinsics.checkNotNull(object2, (String)object4);
                    object2 = (ko0_0)object2;
                    n16 = ((ko0_0)object2).d;
                    if (n16 <= n17) {
                        object5 = object;
                    }
                }
                return object5;
            }
            case 4: {
                object4 = jA3$a.a(vj3_2.RATING, this);
                if (object4 == null || (n4 = (int)(((iA3)object4).b() ? 1 : 0)) != n8) break;
                Intrinsics.checkNotNullParameter(this, string3);
                Intrinsics.checkNotNullParameter(object, string2);
                object4 = new ze3_0(this);
                ((pd2_0)object4).b = this;
                ((pd2_0)object4).c = object;
                return ((ze3_0)object4).a((Context)object2, (Bundle)object, n3, (J42)object3);
            }
            case 3: {
                object4 = jA3$a.a(vj3_2.MANUAL_CAROUSEL, this);
                if (object4 == null || (n4 = (int)(((iA3)object4).b() ? 1 : 0)) != n8) break;
                Intrinsics.checkNotNullParameter(this, string3);
                Intrinsics.checkNotNullParameter(object, string2);
                object4 = new ze3_0(this);
                ((mg1_1)object4).b = this;
                ((mg1_1)object4).c = object;
                return ((ze3_0)object4).a((Context)object2, (Bundle)object, n3, (J42)object3);
            }
            case 2: {
                object4 = jA3$a.a(vj3_2.AUTO_CAROUSEL, this);
                if (object4 == null || (n4 = (int)(((iA3)object4).b() ? 1 : 0)) != n8) break;
                Intrinsics.checkNotNullParameter(this, string3);
                object4 = new ze3_0(this);
                ((wr_1)object4).b = this;
                return ((ze3_0)object4).a((Context)object2, (Bundle)object, n3, (J42)object3);
            }
            case 1: {
                object4 = jA3$a.a(vj3_2.BASIC, this);
                if (object4 == null || (n4 = (int)(((iA3)object4).b() ? 1 : 0)) != n8) break;
                object4 = new ax_0(this);
                return ((ze3_0)object4).a((Context)object2, (Bundle)object, n3, (J42)object3);
            }
        }
        return null;
    }

    public final J42 e(Context object, Bundle object2, J42 j42, CleverTapInstanceConfig cleverTapInstanceConfig) {
        block29: {
            block31: {
                block33: {
                    boolean bl2;
                    int n4;
                    String string2;
                    String string3;
                    Object object3;
                    block30: {
                        object3 = "wzrk_sound";
                        string3 = "android.resource://";
                        Intrinsics.checkNotNullParameter(object, "context");
                        Intrinsics.checkNotNullParameter(object2, "extras");
                        Intrinsics.checkNotNullParameter(j42, "nb");
                        string2 = "config";
                        Intrinsics.checkNotNullParameter(cleverTapInstanceConfig, string2);
                        n4 = object2.containsKey((String)object3);
                        if (n4 == 0) break block29;
                        object2 = object2.get((String)object3);
                        boolean n3 = object2 instanceof Boolean;
                        n4 = 2;
                        if (n3) {
                            object3 = object2;
                            object3 = (Boolean)object2;
                            boolean bl3 = (Boolean)object3;
                            if (!bl3) break block30;
                            object = RingtoneManager.getDefaultUri((int)n4);
                            break block31;
                        }
                    }
                    if (bl2 = object2 instanceof String) {
                        block35: {
                            block34: {
                                block32: {
                                    object3 = "true";
                                    boolean bl4 = Intrinsics.areEqual(object2, object3);
                                    if (!bl4) break block32;
                                    object = RingtoneManager.getDefaultUri((int)n4);
                                    break block31;
                                }
                                object3 = object2;
                                object3 = (CharSequence)object2;
                                int n3 = object3.length();
                                if (n3 == 0) break block33;
                                object3 = object2;
                                object3 = (CharSequence)object2;
                                string2 = ".mp3";
                                boolean bl5 = StringsKt.F((CharSequence)object3, string2, false);
                                if (bl5) break block34;
                                object3 = object2;
                                object3 = (CharSequence)object2;
                                string2 = ".ogg";
                                boolean bl6 = StringsKt.F((CharSequence)object3, string2, false);
                                if (bl6) break block34;
                                object3 = object2;
                                object3 = (CharSequence)object2;
                                string2 = ".wav";
                                boolean bl7 = StringsKt.F((CharSequence)object3, string2, false);
                                if (!bl7) break block35;
                            }
                            object3 = object2;
                            object3 = (String)object2;
                            object2 = (String)object2;
                            int n7 = ((String)object2).length() + -4;
                            object2 = ((String)object3).substring(0, n7);
                            object3 = "substring(...)";
                            Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                        }
                        object3 = new StringBuilder(string3);
                        object = object.getPackageName();
                        ((StringBuilder)object3).append((String)object);
                        object = "/raw/";
                        ((StringBuilder)object3).append((String)object);
                        object2 = (String)object2;
                        ((StringBuilder)object3).append((String)object2);
                        object = ((StringBuilder)object3).toString();
                        object = Uri.parse((String)object);
                        break block31;
                    }
                }
                object = null;
            }
            if (object == null) break block29;
            try {
                j42.f((Uri)object);
            }
            catch (Throwable throwable) {
                object = cleverTapInstanceConfig.b();
                object.getClass();
                com.clevertap.android.sdk.b.g();
            }
        }
        return j42;
    }

    public final String f(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "extras");
        return this.d;
    }
}

