/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public abstract class FunctionImpl
implements fx0_2,
Serializable,
Function0,
Function1,
Function2,
gx0_2,
hx0_2,
ix0_2,
jx0_2,
kx0_2,
lx0_2,
mx0_2,
rx0_2,
sx0_2,
tx0_2,
ux0_2,
vx0_2,
wx0_2,
xx0_2,
yx0_2,
zx0_2,
ax0_2,
cx0_2,
dx0_2,
ex0_2 {
    private void checkArity(int n3) {
        int n4 = this.getArity();
        if (n4 != n3) {
            this.throwWrongArity(n3);
        }
    }

    private void throwWrongArity(int n3) {
        CharSequence charSequence = wk0_0.a(n3, "Wrong function arity, expected: ", ", actual: ");
        int n4 = this.getArity();
        charSequence.append(n4);
        charSequence = charSequence.toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
        throw illegalStateException;
    }

    public abstract int getArity();

    public Object invoke() {
        this.checkArity(0);
        Object[] objectArray = new Object[]{};
        return this.invokeVararg(objectArray);
    }

    public Object invoke(Object object) {
        int n3 = 1;
        this.checkArity(n3);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        return this.invokeVararg(objectArray);
    }

    public Object invoke(Object object, Object object2) {
        int n3 = 2;
        this.checkArity(n3);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        return this.invokeVararg(objectArray);
    }

    public Object invoke(Object object, Object object2, Object object3) {
        int n3 = 3;
        this.checkArity(n3);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        return this.invokeVararg(objectArray);
    }

    public Object invoke(Object object, Object object2, Object object3, Object object4) {
        int n3 = 4;
        this.checkArity(n3);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        return this.invokeVararg(objectArray);
    }

    public Object invoke(Object object, Object object2, Object object3, Object object4, Object object5) {
        int n3 = 5;
        this.checkArity(n3);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        objectArray[4] = object5;
        return this.invokeVararg(objectArray);
    }

    public Object invoke(Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
        int n3 = 6;
        this.checkArity(n3);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        objectArray[4] = object5;
        objectArray[5] = object6;
        return this.invokeVararg(objectArray);
    }

    public Object invoke(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        int n3 = 7;
        this.checkArity(n3);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        objectArray[4] = object5;
        objectArray[5] = object6;
        objectArray[6] = object7;
        return this.invokeVararg(objectArray);
    }

    public Object invoke(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
        int n3 = 8;
        this.checkArity(n3);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        objectArray[4] = object5;
        objectArray[5] = object6;
        objectArray[6] = object7;
        objectArray[7] = object8;
        return this.invokeVararg(objectArray);
    }

    public Object invoke(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
        int n3 = 9;
        this.checkArity(n3);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        objectArray[4] = object5;
        objectArray[5] = object6;
        objectArray[6] = object7;
        objectArray[7] = object8;
        objectArray[8] = object9;
        return this.invokeVararg(objectArray);
    }

    public Object invoke(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
        int n3 = 10;
        this.checkArity(n3);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        objectArray[4] = object5;
        objectArray[5] = object6;
        objectArray[6] = object7;
        objectArray[7] = object8;
        objectArray[8] = object9;
        objectArray[9] = object10;
        return this.invokeVararg(objectArray);
    }

    public Object invoke(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11) {
        int n3 = 11;
        this.checkArity(n3);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        objectArray[4] = object5;
        objectArray[5] = object6;
        objectArray[6] = object7;
        objectArray[7] = object8;
        objectArray[8] = object9;
        objectArray[9] = object10;
        objectArray[10] = object11;
        return this.invokeVararg(objectArray);
    }

    public Object invoke(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12) {
        int n3 = 12;
        this.checkArity(n3);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        objectArray[4] = object5;
        objectArray[5] = object6;
        objectArray[6] = object7;
        objectArray[7] = object8;
        objectArray[8] = object9;
        objectArray[9] = object10;
        objectArray[10] = object11;
        objectArray[11] = object12;
        return this.invokeVararg(objectArray);
    }

    public Object invoke(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13) {
        int n3 = 13;
        this.checkArity(n3);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        objectArray[4] = object5;
        objectArray[5] = object6;
        objectArray[6] = object7;
        objectArray[7] = object8;
        objectArray[8] = object9;
        objectArray[9] = object10;
        objectArray[10] = object11;
        objectArray[11] = object12;
        objectArray[12] = object13;
        return this.invokeVararg(objectArray);
    }

    public Object invoke(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14) {
        int n3 = 14;
        this.checkArity(n3);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        objectArray[4] = object5;
        objectArray[5] = object6;
        objectArray[6] = object7;
        objectArray[7] = object8;
        objectArray[8] = object9;
        objectArray[9] = object10;
        objectArray[10] = object11;
        objectArray[11] = object12;
        objectArray[12] = object13;
        objectArray[13] = object14;
        return this.invokeVararg(objectArray);
    }

    public Object invoke(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15) {
        int n3 = 15;
        this.checkArity(n3);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        objectArray[4] = object5;
        objectArray[5] = object6;
        objectArray[6] = object7;
        objectArray[7] = object8;
        objectArray[8] = object9;
        objectArray[9] = object10;
        objectArray[10] = object11;
        objectArray[11] = object12;
        objectArray[12] = object13;
        objectArray[13] = object14;
        objectArray[14] = object15;
        return this.invokeVararg(objectArray);
    }

    public Object invoke(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16) {
        int n3 = 16;
        this.checkArity(n3);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        objectArray[4] = object5;
        objectArray[5] = object6;
        objectArray[6] = object7;
        objectArray[7] = object8;
        objectArray[8] = object9;
        objectArray[9] = object10;
        objectArray[10] = object11;
        objectArray[11] = object12;
        objectArray[12] = object13;
        objectArray[13] = object14;
        objectArray[14] = object15;
        objectArray[15] = object16;
        return this.invokeVararg(objectArray);
    }

    public Object invoke(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17) {
        int n3 = 17;
        this.checkArity(n3);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        objectArray[4] = object5;
        objectArray[5] = object6;
        objectArray[6] = object7;
        objectArray[7] = object8;
        objectArray[8] = object9;
        objectArray[9] = object10;
        objectArray[10] = object11;
        objectArray[11] = object12;
        objectArray[12] = object13;
        objectArray[13] = object14;
        objectArray[14] = object15;
        objectArray[15] = object16;
        objectArray[16] = object17;
        return this.invokeVararg(objectArray);
    }

    public Object invoke(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18) {
        int n3 = 18;
        this.checkArity(n3);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        objectArray[4] = object5;
        objectArray[5] = object6;
        objectArray[6] = object7;
        objectArray[7] = object8;
        objectArray[8] = object9;
        objectArray[9] = object10;
        objectArray[10] = object11;
        objectArray[11] = object12;
        objectArray[12] = object13;
        objectArray[13] = object14;
        objectArray[14] = object15;
        objectArray[15] = object16;
        objectArray[16] = object17;
        objectArray[17] = object18;
        return this.invokeVararg(objectArray);
    }

    public Object invoke(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18, Object object19) {
        int n3 = 19;
        this.checkArity(n3);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        objectArray[4] = object5;
        objectArray[5] = object6;
        objectArray[6] = object7;
        objectArray[7] = object8;
        objectArray[8] = object9;
        objectArray[9] = object10;
        objectArray[10] = object11;
        objectArray[11] = object12;
        objectArray[12] = object13;
        objectArray[13] = object14;
        objectArray[14] = object15;
        objectArray[15] = object16;
        objectArray[16] = object17;
        objectArray[17] = object18;
        objectArray[18] = object19;
        return this.invokeVararg(objectArray);
    }

    public Object invoke(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18, Object object19, Object object20) {
        int n3 = 20;
        this.checkArity(n3);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        objectArray[4] = object5;
        objectArray[5] = object6;
        objectArray[6] = object7;
        objectArray[7] = object8;
        objectArray[8] = object9;
        objectArray[9] = object10;
        objectArray[10] = object11;
        objectArray[11] = object12;
        objectArray[12] = object13;
        objectArray[13] = object14;
        objectArray[14] = object15;
        objectArray[15] = object16;
        objectArray[16] = object17;
        objectArray[17] = object18;
        objectArray[18] = object19;
        objectArray[19] = object20;
        return this.invokeVararg(objectArray);
    }

    public Object invoke(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18, Object object19, Object object20, Object object21) {
        int n3 = 21;
        this.checkArity(n3);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        objectArray[4] = object5;
        objectArray[5] = object6;
        objectArray[6] = object7;
        objectArray[7] = object8;
        objectArray[8] = object9;
        objectArray[9] = object10;
        objectArray[10] = object11;
        objectArray[11] = object12;
        objectArray[12] = object13;
        objectArray[13] = object14;
        objectArray[14] = object15;
        objectArray[15] = object16;
        objectArray[16] = object17;
        objectArray[17] = object18;
        objectArray[18] = object19;
        objectArray[19] = object20;
        objectArray[20] = object21;
        return this.invokeVararg(objectArray);
    }

    public Object invoke(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18, Object object19, Object object20, Object object21, Object object22) {
        int n3 = 22;
        this.checkArity(n3);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        objectArray[4] = object5;
        objectArray[5] = object6;
        objectArray[6] = object7;
        objectArray[7] = object8;
        objectArray[8] = object9;
        objectArray[9] = object10;
        objectArray[10] = object11;
        objectArray[11] = object12;
        objectArray[12] = object13;
        objectArray[13] = object14;
        objectArray[14] = object15;
        objectArray[15] = object16;
        objectArray[16] = object17;
        objectArray[17] = object18;
        objectArray[18] = object19;
        objectArray[19] = object20;
        objectArray[20] = object21;
        objectArray[21] = object22;
        return this.invokeVararg(objectArray);
    }

    public Object invokeVararg(Object ... object) {
        object = new UnsupportedOperationException();
        throw object;
    }
}

