/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteException;

/*
 * Renamed from a50
 */
public final class a50_0
implements nj1_2 {
    public static final a50_0 a;

    static {
        a50_0 a50_02;
        a = a50_02 = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final cl2_2 intercept(nj1$a object) {
        Object object2;
        block13: {
            block14: {
                block15: {
                    RouteException routeException2;
                    Object object3;
                    block16: {
                        zc0_2 zc0_22;
                        Intrinsics.checkNotNullParameter(object, "chain");
                        object = (te2_2)object;
                        object3 = ((te2_2)object).a;
                        object3.getClass();
                        object2 = "chain";
                        Intrinsics.checkNotNullParameter(object, (String)object2);
                        // MONITORENTER : object3
                        boolean bl2 = ((RealCall)object3).o;
                        if (!bl2) break block13;
                        bl2 = ((RealCall)object3).n;
                        boolean bl3 = true;
                        if (!(bl2 ^= bl3)) break block14;
                        bl2 = ((RealCall)object3).m ^ bl3;
                        if (!bl2) break block15;
                        object2 = Unit.a;
                        object2 = ((RealCall)object3).i;
                        Intrinsics.checkNotNull(object2);
                        x72_0 x72_02 = ((RealCall)object3).a;
                        object2.getClass();
                        Intrinsics.checkNotNullParameter(x72_02, "client");
                        Object object4 = "chain";
                        Intrinsics.checkNotNullParameter(object, (String)object4);
                        try {
                            int n3 = ((te2_2)object).f;
                            int n4 = ((te2_2)object).g;
                            int n7 = ((te2_2)object).h;
                            int n8 = x72_02.B;
                            boolean bl4 = x72_02.f;
                            object4 = ((te2_2)object).e;
                            object4 = ((kj2_2)object4).b;
                            String string2 = "GET";
                            boolean bl5 = Intrinsics.areEqual(object4, string2);
                            boolean bl6 = bl5 ^ true;
                            object4 = object2;
                            object4 = ((jc0_2)object2).a(n3, n4, n7, n8, bl4, bl6);
                            object4 = ((je2_2)object4).k(x72_02, (te2_2)object);
                        }
                        catch (IOException iOException) {
                        }
                        catch (RouteException routeException2) {
                            break block16;
                        }
                        IB0$a iB0$a = (IB0$a)((RealCall)object3).e;
                        ((RealCall)object3).l = zc0_22 = new zc0_2((RealCall)object3, iB0$a, (jc0_2)object2, (ac0_2)object4);
                        ((RealCall)object3).q = zc0_22;
                        // MONITORENTER : object3
                        ((RealCall)object3).m = bl3;
                        ((RealCall)object3).n = bl3;
                        // MONITOREXIT : object3
                        boolean bl7 = ((RealCall)object3).p;
                        if (!bl7) {
                            object2 = object;
                            object4 = zc0_22;
                            object3 = te2_2.c((te2_2)object, 0, zc0_22, null, 0, 0, 0, 61);
                            object = ((te2_2)object).e;
                            return ((te2_2)object3).a((kj2_2)object);
                        }
                        object = new IOException("Canceled");
                        throw object;
                        ((jc0_2)object2).c(iOException);
                        object3 = new RouteException(iOException);
                        throw object3;
                    }
                    object3 = routeException2.b;
                    ((jc0_2)object2).c((IOException)object3);
                    throw routeException2;
                }
                object = "Check failed.";
                object = object.toString();
                object2 = new IllegalStateException((String)object);
                throw object2;
            }
            object = "Check failed.";
            object = object.toString();
            object2 = new IllegalStateException((String)object);
            throw object2;
        }
        object = "released";
        object = object.toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }
}

