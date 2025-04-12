/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.util.Log
 */
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

public abstract class Sl2 {
    public final CoroutineContext a;
    public z61 b;
    public pk2_0 c;
    public final mr1_1 d;
    public final CopyOnWriteArrayList e;
    public final l63_0 f;
    public volatile boolean g;
    public volatile int h;
    public final kb3_2 i;
    public final ge2_2 j;
    public final i23_0 k;

    public Sl2(CoroutineContext object, Ml2 object2) {
        Object object3 = "mainContext";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        this.a = object;
        object = pk2_0.e;
        object = object2 != null ? (rk2$b)((Ml2)object2).d.invoke() : null;
        if (object != null) {
            object3 = new pk2_0((rk2$b)object);
        } else {
            object3 = pk2_0.e;
            object = "null cannot be cast to non-null type androidx.paging.PageStore<T of androidx.paging.PageStore.Companion.initial>";
            Intrinsics.checkNotNull(object3, (String)object);
        }
        this.c = object3;
        object = new mr1_1();
        if (object2 != null && (object2 = (rk2$b)((Ml2)object2).d.invoke()) != null) {
            object3 = ((rk2$b)object2).e;
            object2 = ((rk2$b)object2).f;
            ((mr1_1)object).d((Qv1)object3, (Qv1)object2);
        }
        this.d = object;
        object2 = new CopyOnWriteArrayList();
        this.e = object2;
        this.f = object3 = new l63_0(true);
        this.i = object3 = lb3_2.a(Boolean.FALSE);
        this.j = object = ((mr1_1)object).c;
        object3 = he_2.DROP_OLDEST;
        this.k = object = k23_0.a(0, 64, (he_2)((Object)object3));
        object = new Sl2$a(this);
        Intrinsics.checkNotNullParameter(object, "listener");
        ((CopyOnWriteArrayList)object2).add(object);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object a(Sl2 var0, List var1_1, int var2_2, int var3_3, boolean var4_4, Qv1 var5_5, Qv1 var6_6, z61 var7_7, f80_0 var8_8) {
        block16: {
            block15: {
                block13: {
                    block14: {
                        var0.getClass();
                        var9_9 = var8_8 instanceof vl2_0;
                        if (!var9_9) ** GOTO lbl-1000
                        var10_10 = var8_8;
                        var10_10 = (vl2_0)var8_8;
                        var11_11 = var10_10.l;
                        var12_12 = -1 << -1;
                        var13_13 = var11_11 & var12_12;
                        if (var13_13 != 0) {
                            var10_10.l = var11_11 -= var12_12;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var10_10 = new vl2_0((Sl2)var0, (f80_0)var8_8);
                        }
                        var8_8 = var10_10.j;
                        var14_14 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                        var12_12 = var10_10.l;
                        var13_13 = 1;
                        if (var12_12 == 0) break block13;
                        if (var12_12 != var13_13) break block14;
                        var4_4 = var10_10.i;
                        var3_3 = var10_10.h;
                        var2_2 = var10_10.g;
                        var0 = var10_10.f;
                        var7_7 = var10_10.e;
                        var6_6 = var10_10.d;
                        var5_5 = var10_10.c;
                        var1_1 = var10_10.b;
                        var10_10 = var10_10.a;
                        vl2_2.b(var8_8);
                        var8_8 = var0;
                        var0 = var10_10;
                        break block15;
                    }
                    var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var0;
                }
                vl2_2.b(var8_8);
                if (var4_4 && var5_5 == null) {
                    var1_1 = "Cannot dispatch LoadStates in PagingDataPresenter without source LoadStates set.".toString();
                    var0 = new IllegalArgumentException((String)var1_1);
                    throw var0;
                }
                var0.g = false;
                var8_8 = new pk2_0(var2_2, var3_3, (List)var1_1);
                var15_15 = var0.c;
                Intrinsics.checkNotNull(var15_15, "null cannot be cast to non-null type androidx.paging.PlaceholderPaddedList<T of androidx.paging.PagingDataPresenter>");
                var0.c = var8_8;
                var0.b = var7_7;
                var16_16 = new Rl2$e((pk2_0)var8_8, (us2_0)var15_15);
                var10_10.a = var0;
                var15_15 = var1_1;
                var10_10.b = var15_15 = (List)var1_1;
                var10_10.c = var5_5;
                var10_10.d = var6_6;
                var10_10.e = var7_7;
                var10_10.f = var8_8;
                var10_10.g = var2_2;
                var10_10.h = var3_3;
                var10_10.i = var4_4;
                var10_10.l = var13_13;
                var10_10 = var0.c(var16_16, (f80_0)var10_10);
                if (var10_10 == var14_14 /* !! */ ) break block16;
            }
            var10_10 = Build.ID;
            if (var10_10 != null && (var9_9 = Log.isLoggable((String)(var10_10 = "Paging"), (int)(var11_11 = 3)))) {
                var10_10 = new StringBuilder("Presenting data (\n                            |   first item: ");
                var14_14 /* !! */  = (Wq3)CollectionsKt.firstOrNull((List)var1_1);
                var12_12 = 0;
                var15_15 = null;
                if (var14_14 /* !! */  != null && (var14_14 /* !! */  = var14_14 /* !! */ .b) != null) {
                    var14_14 /* !! */  = CollectionsKt.firstOrNull((List)var14_14 /* !! */ );
                } else {
                    var11_11 = 0;
                    var14_14 /* !! */  = null;
                }
                var10_10.append((Object)var14_14 /* !! */ );
                var14_14 /* !! */  = "\n                            |   last item: ";
                var10_10.append((String)var14_14 /* !! */ );
                var1_1 = (Wq3)CollectionsKt.T((List)var1_1);
                if (var1_1 != null && (var1_1 = var1_1.b) != null) {
                    var15_15 = CollectionsKt.T((List)var1_1);
                }
                var10_10.append(var15_15);
                var10_10.append("\n                            |   placeholdersBefore: ");
                var10_10.append(var2_2);
                var10_10.append("\n                            |   placeholdersAfter: ");
                var10_10.append(var3_3);
                var10_10.append("\n                            |   hintReceiver: ");
                var10_10.append(var7_7);
                var10_10.append("\n                            |   sourceLoadStates: ");
                var10_10.append(var5_5);
                var10_10.append("\n                        ");
                var1_1 = var10_10.toString();
                if (var6_6 != null) {
                    var17_17 = new StringBuilder();
                    var17_17.append((String)var1_1);
                    var17_17.append("|   mediatorLoadStates: ");
                    var17_17.append(var6_6);
                    var18_18 = '\n';
                    var17_17.append(var18_18);
                    var1_1 = var17_17.toString();
                }
                var17_17 = new StringBuilder();
                var17_17.append((String)var1_1);
                var17_17.append("|)");
                var1_1 = ee3_2.c(var17_17.toString());
                var17_17 = "message";
                Intrinsics.checkNotNullParameter(var1_1, (String)var17_17);
            }
            if (var4_4) {
                var1_1 = var0.d;
                Intrinsics.checkNotNull(var5_5);
                var1_1.d(var5_5, var6_6);
            }
            if ((var18_18 = var8_8.getSize()) == '\u0000' && (var0 = var0.b) != null) {
                var18_18 = var8_8.b;
                var3_3 = var8_8.e();
                var4_4 = var8_8.f();
                var17_17 = new re3_0(var18_18 /= 2, var18_18, var3_3, (int)var4_4);
                var0.a((re3_0)var17_17);
            }
            var14_14 /* !! */  = Unit.a;
        }
        return var14_14 /* !! */ ;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object b(int n3) {
        int n4;
        Object object;
        Object object2;
        int n7;
        Object object3 = this.i;
        do {
            object = object2 = ((kb3_2)object3).getValue();
            ((Boolean)object2).getClass();
        } while ((n7 = ((kb3_2)object3).j(object2, object = Boolean.TRUE)) == 0);
        this.g = n4 = 1;
        this.h = n3;
        object3 = Build.ID;
        if (object3 != null && (n4 = Log.isLoggable((String)(object3 = "Paging"), (int)(n7 = 2))) != 0) {
            object3 = new StringBuilder("Accessing item index[");
            ((StringBuilder)object3).append(n3);
            n7 = 93;
            ((StringBuilder)object3).append((char)n7);
            object3 = ((StringBuilder)object3).toString();
            object2 = "message";
            Intrinsics.checkNotNullParameter(object3, (String)object2);
        }
        if ((object3 = this.b) != null) {
            object2 = this.c.d(n3);
            object3.a((re3_0)object2);
        }
        object3 = this.c;
        if (n3 >= 0) {
            n7 = ((pk2_0)object3).getSize();
            if (n3 < n7) {
                Object object4;
                void var7_8;
                n7 = ((pk2_0)object3).c;
                if ((n3 -= n7) >= 0 && n3 < (n7 = ((pk2_0)object3).b)) {
                    Object object5 = ((pk2_0)object3).getItem(n3);
                } else {
                    n3 = 0;
                    Object var7_9 = null;
                }
                object2 = var7_8;
                object = this.i;
                do {
                    object3 = object4 = ((kb3_2)object).getValue();
                    ((Boolean)object4).getClass();
                } while ((n3 = (int)(((kb3_2)object).j(object4, object3 = Boolean.FALSE) ? 1 : 0)) == 0);
                return object2;
            }
        } else {
            object3.getClass();
        }
        StringBuilder stringBuilder = wk0_0.a(n3, "Index: ", ", Size: ");
        n4 = ((pk2_0)object3).getSize();
        stringBuilder.append(n4);
        String string2 = stringBuilder.toString();
        object2 = new IndexOutOfBoundsException(string2);
        throw object2;
    }

    public abstract Object c(Rl2 var1, f80_0 var2);

    public final wk1_0 d() {
        boolean bl2;
        Object object = this.c;
        int n3 = ((pk2_0)object).c;
        int n4 = ((pk2_0)object).d;
        object = ((pk2_0)object).a;
        ArrayList arrayList = new ArrayList();
        object = ((ArrayList)object).iterator();
        while (bl2 = object.hasNext()) {
            Iterable iterable = ((Wq3)object.next()).b;
            cx_2.r(iterable, arrayList);
        }
        object = new wk1_0(arrayList, n3, n4);
        return object;
    }
}

