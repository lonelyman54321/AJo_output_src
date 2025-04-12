/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.InputFilter
 *  android.text.method.PasswordTransformationMethod
 *  android.text.method.TransformationMethod
 *  android.util.SparseArray
 *  android.widget.TextView
 */
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/*
 * Renamed from Vy0$a
 */
public final class vy0$a_0
extends vy0$b_0 {
    public final TextView a;
    public final Ry0 b;
    public boolean c;

    public vy0$a_0(TextView textView) {
        Ry0 ry0;
        this.a = textView;
        this.c = true;
        this.b = ry0 = new Ry0(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArray) {
        block7: {
            Ry0 ry0;
            int n3 = this.c;
            int n4 = 0;
            int n7 = 1;
            if (n3 == 0) {
                int n8;
                InputFilter[] inputFilterArray2;
                int n10;
                SparseArray sparseArray = new SparseArray(n7);
                Object var6_6 = null;
                for (n7 = 0; n7 < (n10 = inputFilterArray.length); ++n7) {
                    inputFilterArray2 = inputFilterArray[n7];
                    n8 = inputFilterArray2 instanceof Ry0;
                    if (n8 == 0) continue;
                    sparseArray.put(n7, (Object)inputFilterArray2);
                }
                n7 = sparseArray.size();
                if (n7 != 0) {
                    n7 = inputFilterArray.length;
                    n10 = inputFilterArray.length;
                    n8 = sparseArray.size();
                    inputFilterArray2 = new InputFilter[n10 -= n8];
                    n8 = 0;
                    Object var10_13 = null;
                    while (n4 < n7) {
                        int n14 = sparseArray.indexOfKey(n4);
                        if (n14 < 0) {
                            InputFilter inputFilter;
                            inputFilterArray2[n8] = inputFilter = inputFilterArray[n4];
                            ++n8;
                        }
                        ++n4;
                    }
                    inputFilterArray = inputFilterArray2;
                }
                return inputFilterArray;
            }
            n3 = inputFilterArray.length;
            int n15 = 0;
            Object var8_11 = null;
            while (true) {
                ry0 = this.b;
                if (n15 >= n3) break;
                InputFilter inputFilter = inputFilterArray[n15];
                if (inputFilter != ry0) {
                    ++n15;
                    continue;
                }
                break block7;
                break;
            }
            n15 = inputFilterArray.length + n7;
            InputFilter[] inputFilterArray3 = new InputFilter[n15];
            System.arraycopy(inputFilterArray, 0, inputFilterArray3, 0, n3);
            inputFilterArray3[n3] = ry0;
            inputFilterArray = inputFilterArray3;
        }
        return inputFilterArray;
    }

    public final boolean b() {
        return this.c;
    }

    public final void c(boolean bl2) {
        if (bl2) {
            TextView textView = this.a;
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            transformationMethod = this.e(transformationMethod);
            textView.setTransformationMethod(transformationMethod);
        }
    }

    public final void d(boolean bl2) {
        this.c = bl2;
        TextView textView = this.a;
        InputFilter[] inputFilterArray = textView.getTransformationMethod();
        inputFilterArray = this.e((TransformationMethod)inputFilterArray);
        textView.setTransformationMethod((TransformationMethod)inputFilterArray);
        inputFilterArray = textView.getFilters();
        inputFilterArray = this.a(inputFilterArray);
        textView.setFilters(inputFilterArray);
    }

    public final TransformationMethod e(TransformationMethod transformationMethod) {
        boolean bl2 = this.c;
        if (bl2) {
            bl2 = transformationMethod instanceof xy0_0;
            if (!bl2 && !(bl2 = transformationMethod instanceof PasswordTransformationMethod)) {
                xy0_0 xy0_02 = new xy0_0(transformationMethod);
                transformationMethod = xy0_02;
            }
            return transformationMethod;
        }
        bl2 = transformationMethod instanceof xy0_0;
        if (bl2) {
            transformationMethod = ((xy0_0)transformationMethod).a;
        }
        return transformationMethod;
    }
}

