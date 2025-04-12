/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.drawable.Drawable
 */
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class fX$a
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ pe1_0 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ fb3_2 e;

    public fX$a(pe1_0 pe1_02, Context context, fb3_2 fb3_22, f80_0 f80_02) {
        this.c = pe1_02;
        this.d = context;
        this.e = fb3_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Context context = this.d;
        fb3_2 fb3_22 = this.e;
        pe1_0 pe1_02 = this.c;
        fX$a fX$a = new fX$a(pe1_02, context, fb3_22, f80_02);
        fX$a.b = object;
        return fX$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (pz2_2)object;
        object2 = (f80_0)object2;
        object = (fX$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((fX$a)object).invokeSuspend(object2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        Object object3;
        int n3;
        j90_0 j90_02;
        block14: {
            se1_0 se1_02;
            int n4;
            block12: {
                void var1_17;
                Drawable drawable2;
                block11: {
                    block13: {
                        void var1_8;
                        Context context;
                        j90_02 = j90_0.COROUTINE_SUSPENDED;
                        int n7 = this.a;
                        n3 = 2;
                        n4 = 1;
                        if (n7 != 0) {
                            if (n7 != n4) {
                                if (n7 == n3) {
                                    vl2_2.b(object);
                                    return Unit.a;
                                }
                                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw illegalStateException;
                            }
                            object3 = (pz2_2)this.b;
                            vl2_2.b(object);
                        } else {
                            Object object4;
                            vl2_2.b(object);
                            object3 = object4 = this.b;
                            object3 = (pz2_2)object4;
                            pe1_0 pe1_02 = this.c;
                            pe1_02.getClass();
                            context = this.d;
                            object2 = new pe1$a_0(pe1_02, context);
                            fX$a$a fX$a$a = new fX$a$a((pz2_2)object3);
                            ((pe1$a_0)object2).d = fX$a$a;
                            ((pe1$a_0)object2).c();
                            pe1_0 pe1_03 = ((pe1$a_0)object2).a();
                            object2 = (ce1_0)this.e.a;
                            this.b = object3;
                            this.a = n4;
                            Object object5 = object2.c(pe1_03, this);
                            if (object5 == j90_02) {
                                return j90_02;
                            }
                        }
                        se1_02 = (se1_0)var1_8;
                        boolean bl2 = se1_02 instanceof cg3_2;
                        context = null;
                        if (!bl2) break block12;
                        cg3_2 cg3_22 = (cg3_2)se1_02;
                        drawable2 = cg3_22.a;
                        int[] nArray = kx$a_0.$EnumSwitchMapping$0;
                        ri0 ri02 = cg3_22.c;
                        int n8 = ri02.ordinal();
                        if ((n8 = nArray[n8]) == n4) break block13;
                        if (n8 != n3) {
                            n4 = 3;
                            if (n8 != n4) {
                                n4 = 4;
                                if (n8 != n4) {
                                    NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
                                    throw noWhenBranchMatchedException;
                                }
                                qi0_1 qi0_12 = qi0_1.DISK;
                                break block11;
                            } else {
                                qi0_1 qi0_13 = qi0_1.MEMORY;
                            }
                            break block11;
                        } else {
                            qi0_1 qi0_14 = qi0_1.MEMORY;
                        }
                        break block11;
                    }
                    qi0_1 qi0_15 = qi0_1.NETWORK;
                }
                object2 = new zd1$d_0(drawable2, (qi0_1)var1_17);
                break block14;
            }
            n4 = se1_02 instanceof hb0_0;
            if (n4 == 0) {
                NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
                throw noWhenBranchMatchedException;
            }
            hb0_0 hb0_02 = (hb0_0)se1_02;
            Drawable drawable3 = hb0_02.a;
            ih_0 ih_02 = drawable3 != null && (drawable3 = bu0_0.a(drawable3)) != null ? new ih_0((Bitmap)drawable3) : null;
            Throwable throwable = hb0_02.c;
            object2 = new zd1$a_0(ih_02, throwable);
        }
        this.b = null;
        this.a = n3;
        Object object6 = object3.o(this, object2);
        if (object6 != j90_02) return Unit.a;
        return j90_02;
    }
}

