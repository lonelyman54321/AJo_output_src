/*
 * Decompiled with CFR 0.152.
 */
import com.clevertap.android.sdk.b;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from U91
 */
public final class u91_0 {
    public static final pb1_1 a;
    public static final pb1_1 b;

    static {
        pb1_1 pb1_12;
        Object object = new Pair("Accept-Encoding", "gzip, deflate");
        Map map2 = eh1_2.d((Pair)object);
        object = pb1_12;
        a = pb1_12 = new pb1_1(1000, 5000, true, true, map2);
        b = object = new pb1_1(5000, true, true, 15000, 16);
    }

    public static final rs0_1 a(U91$a object, ox_0 ox_02) {
        Intrinsics.checkNotNullParameter(object, "bitmapOperation");
        Object object2 = "bitmapDownloadRequest";
        Intrinsics.checkNotNullParameter(ox_02, (String)object2);
        Object object3 = U91$b.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = object3[n3];
        object3 = b;
        boolean bl2 = true;
        Object object4 = null;
        Object object5 = ox_02.c;
        Object object6 = "getDownloadedBitmapPostF\u2026s(NO_IMAGE)\n            )";
        Object object7 = "status";
        String string2 = "getDownloadedBitmapPostF\u2026ontext, downloadedBitmap)";
        Object object8 = "iBitmapDownloadRequestHandler";
        pb1_1 pb1_12 = a;
        switch (n3) {
            default: {
                object = new NoWhenBranchMatchedException();
                throw object;
            }
            case 7: {
                int n4 = 4;
                object5 = new ly_0(bl2, null, n4);
                object2 = new sx_2((pb1_1)object3, (ly_0)object5);
                object = new px_0((sx_2)object2);
                object = ((px_0)object).a(ox_02);
                break;
            }
            case 6: {
                object3 = new b21;
                object3();
                object2 = new sx_2(pb1_12, (ly_0)object3);
                object = new px_0((sx_2)object2);
                object = ((px_0)object).a(ox_02);
                break;
            }
            case 5: {
                int n7 = 6;
                object5 = new ly_0(bl2, null, n7);
                object2 = new sx_2((pb1_1)object3, (ly_0)object5);
                object = new px_0((sx_2)object2);
                object = ((px_0)object).a(ox_02);
                break;
            }
            case 4: {
                object3 = new px_0;
                object4 = new b21();
                object6 = Boolean.TRUE;
                int n8 = ox_02.f;
                object7 = n8;
                object5 = new Pair(object6, object7);
                sx_2 sx_22 = new sx_2(pb1_12, (ly_0)object4, (Pair)object5);
                object3(sx_22);
                object2 = new z42((px_0)object3);
                object = new rx_1((z42)object2);
                object = ((rx_1)object).a(ox_02);
                break;
            }
            case 3: {
                boolean bl3;
                object3 = new sx_2;
                b21 b212 = new b21();
                Object object9 = Boolean.TRUE;
                int n10 = ox_02.f;
                Integer n14 = n10;
                object4 = new Pair(object9, n14);
                object3(pb1_12, b212, (Pair)object4);
                object = new px_0((sx_2)object3);
                Intrinsics.checkNotNullParameter(object, (String)object8);
                Intrinsics.checkNotNullParameter(ox_02, (String)object2);
                com.clevertap.android.sdk.b.j();
                object2 = ox_02.a;
                boolean bl4 = ox_02.b;
                if (object2 != null && !(bl3 = kotlin.text.b.k((CharSequence)object2))) {
                    object = ((px_0)object).a(ox_02);
                    object = yz3_0.f(bl4, object5, (rs0_1)object);
                    Intrinsics.checkNotNullExpressionValue(object, string2);
                    break;
                }
                object9 = rs0$a_0.NO_IMAGE;
                Intrinsics.checkNotNullParameter(object9, (String)object7);
                pb1_12 = null;
                long l2 = -1;
                object8 = object;
                object = new rs0_1(null, (rs0$a_0)((Object)object9), l2, null);
                object = yz3_0.f(bl4, object5, (rs0_1)object);
                Intrinsics.checkNotNullExpressionValue(object, (String)object6);
                break;
            }
            case 2: {
                object3 = new px_0;
                object4 = new b21();
                sx_2 sx_23 = new sx_2(pb1_12, (ly_0)object4);
                object3(sx_23);
                object2 = new z42((px_0)object3);
                object = new rx_1((z42)object2);
                object = ((rx_1)object).a(ox_02);
                break;
            }
            case 1: {
                boolean bl5;
                object3 = new sx_2;
                int n15 = 7;
                boolean bl6 = false;
                Object var18_25 = null;
                ly_0 ly_02 = new ly_0(false, null, n15);
                object3(pb1_12, ly_02);
                object = new px_0((sx_2)object3);
                Intrinsics.checkNotNullParameter(object, (String)object8);
                Intrinsics.checkNotNullParameter(ox_02, (String)object2);
                com.clevertap.android.sdk.b.j();
                object2 = ox_02.a;
                boolean bl7 = ox_02.b;
                if (object2 != null && !(bl5 = kotlin.text.b.k((CharSequence)object2))) {
                    object = ((px_0)object).a(ox_02);
                    object = yz3_0.f(bl7, object5, (rs0_1)object);
                    Intrinsics.checkNotNullExpressionValue(object, string2);
                    break;
                }
                rs0$a_0 rs0$a_0 = rs0$a_0.NO_IMAGE;
                Intrinsics.checkNotNullParameter((Object)rs0$a_0, (String)object7);
                pb1_12 = null;
                long l3 = -1;
                object8 = object;
                object = new rs0_1(null, rs0$a_0, l3, null);
                object = yz3_0.f(bl7, object5, (rs0_1)object);
                Intrinsics.checkNotNullExpressionValue(object, (String)object6);
            }
        }
        return object;
    }
}

