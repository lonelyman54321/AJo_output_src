/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from sb1
 */
public abstract class sb1_2
extends r03_0 {
    public final ak2_2 a;
    public final IJ$a b;
    public final x80_0 c;

    public sb1_2(ak2_2 ak2_22, IJ$a iJ$a, x80_0 x80_02) {
        this.a = ak2_22;
        this.b = iJ$a;
        this.c = x80_02;
    }

    public final Object a(Object object, Object[] objectArray) {
        x80_0 x80_02 = this.c;
        ak2_2 ak2_22 = this.a;
        IJ$a iJ$a = this.b;
        v72_0 v72_02 = new v72_0(ak2_22, object, objectArray, iJ$a, x80_02);
        return this.c(v72_02, objectArray);
    }

    public abstract Object c(v72_0 var1, Object[] var2);
}

