/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 */
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R$styleable;
import java.util.HashMap;

/*
 * Renamed from no1
 */
public final class no1_0
extends oo1_0 {
    public String f;
    public int g;
    public int h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public int o;

    public no1_0() {
        float f5;
        this.e = -1;
        this.f = null;
        this.g = -1;
        this.h = 0;
        this.i = f5 = 0.0f / 0.0f;
        this.j = f5;
        this.k = f5;
        this.l = f5;
        this.m = f5;
        this.n = f5;
        this.o = 0;
    }

    public final void a(HashMap hashMap) {
        throw null;
    }

    public final Pn1 b() {
        float f5;
        int n3;
        String string2;
        no1_0 no1_02 = new no1_0();
        super.c(this);
        no1_02.f = string2 = this.f;
        no1_02.g = n3 = this.g;
        no1_02.h = n3 = this.h;
        no1_02.i = f5 = this.i;
        no1_02.j = 0.0f / 0.0f;
        no1_02.k = f5 = this.k;
        no1_02.l = f5 = this.l;
        no1_02.m = f5 = this.m;
        no1_02.n = f5 = this.n;
        return no1_02;
    }

    public final void e(Context context, AttributeSet attributeSet) {
        int[] nArray = R$styleable.KeyPosition;
        context = context.obtainStyledAttributes(attributeSet, nArray);
        attributeSet = no1$a.a;
        int n3 = context.getIndexCount();
        nArray = null;
        block14: for (int i3 = 0; i3 < n3; ++i3) {
            int n4 = context.getIndex(i3);
            String[] stringArray = no1$a.a;
            int n7 = stringArray.get(n4);
            int n8 = 3;
            switch (n7) {
                default: {
                    Integer.toHexString(n4);
                    stringArray.get(n4);
                    continue block14;
                }
                case 12: {
                    float f5;
                    float f6 = this.j;
                    this.j = f5 = context.getFloat(n4, f6);
                    continue block14;
                }
                case 11: {
                    float f5;
                    float f6 = this.i;
                    this.i = f5 = context.getFloat(n4, f6);
                    continue block14;
                }
                case 10: {
                    int n10 = this.g;
                    this.g = n4 = context.getInt(n4, n10);
                    continue block14;
                }
                case 9: {
                    int n10 = this.o;
                    this.o = n4 = context.getInt(n4, n10);
                    continue block14;
                }
                case 8: {
                    float f5;
                    float f6 = this.j;
                    this.i = f5 = context.getFloat(n4, f6);
                    this.j = f5;
                    continue block14;
                }
                case 7: {
                    float f5;
                    float f6 = this.l;
                    this.l = f5 = context.getFloat(n4, f6);
                    continue block14;
                }
                case 6: {
                    float f5;
                    float f6 = this.k;
                    this.k = f5 = context.getFloat(n4, f6);
                    continue block14;
                }
                case 5: {
                    int n10 = this.h;
                    this.h = n4 = context.getInt(n4, n10);
                    continue block14;
                }
                case 4: {
                    int n10 = this.e;
                    this.e = n4 = context.getInteger(n4, n10);
                    continue block14;
                }
                case 3: {
                    String string2;
                    stringArray = context.peekValue(n4);
                    int n10 = stringArray.type;
                    if (n10 == n8) {
                        this.f = string2 = context.getString(n4);
                        continue block14;
                    }
                    stringArray = bx0_0.c;
                    n4 = context.getInteger(n4, 0);
                    this.f = string2 = stringArray[n4];
                    continue block14;
                }
                case 2: {
                    int n10 = this.a;
                    this.a = n4 = context.getInt(n4, n10);
                    continue block14;
                }
                case 1: {
                    String string2;
                    int n10 = MotionLayout.H0;
                    if (n10 != 0) {
                        n10 = this.b;
                        this.b = n10 = context.getResourceId(n4, n10);
                        n7 = -1;
                        if (n10 != n7) continue block14;
                        this.c = string2 = context.getString(n4);
                        continue block14;
                    }
                    stringArray = context.peekValue(n4);
                    n10 = stringArray.type;
                    if (n10 == n8) {
                        this.c = string2 = context.getString(n4);
                        continue block14;
                    }
                    n10 = this.b;
                    this.b = n4 = context.getResourceId(n4, n10);
                }
            }
        }
    }

    public final void h(Object object, String string2) {
        boolean bl2;
        int n3 = -1;
        int n4 = string2.hashCode();
        switch (n4) {
            default: {
                break;
            }
            case 428090548: {
                String string3 = "percentY";
                bl2 = string2.equals(string3);
                if (!bl2) break;
                n3 = 6;
                break;
            }
            case 428090547: {
                String string4 = "percentX";
                bl2 = string2.equals(string4);
                if (!bl2) break;
                n3 = 5;
                break;
            }
            case -200259324: {
                String string5 = "sizePercent";
                bl2 = string2.equals(string5);
                if (!bl2) break;
                n3 = 4;
                break;
            }
            case -827014263: {
                String string6 = "drawPath";
                bl2 = string2.equals(string6);
                if (!bl2) break;
                n3 = 3;
                break;
            }
            case -1017587252: {
                String string7 = "percentHeight";
                bl2 = string2.equals(string7);
                if (!bl2) break;
                n3 = 2;
                break;
            }
            case -1127236479: {
                String string8 = "percentWidth";
                bl2 = string2.equals(string8);
                if (!bl2) break;
                n3 = 1;
                break;
            }
            case -1812823328: {
                String string9 = "transitionEasing";
                bl2 = string2.equals(string9);
                if (!bl2) break;
                n3 = 0;
            }
        }
        switch (n3) {
            default: {
                break;
            }
            case 6: {
                float f5;
                object = (Number)object;
                this.l = f5 = Pn1.g((Number)object);
                break;
            }
            case 5: {
                float f6;
                object = (Number)object;
                this.k = f6 = Pn1.g((Number)object);
                break;
            }
            case 4: {
                float f7;
                object = (Number)object;
                this.i = f7 = Pn1.g((Number)object);
                this.j = f7;
                break;
            }
            case 3: {
                int n7;
                object = (Number)object;
                bl2 = object instanceof Integer;
                if (bl2) {
                    object = (Integer)object;
                    n7 = (Integer)object;
                } else {
                    object = object.toString();
                    n7 = Integer.parseInt((String)object);
                }
                this.h = n7;
                break;
            }
            case 2: {
                float f8;
                object = (Number)object;
                this.j = f8 = Pn1.g((Number)object);
                break;
            }
            case 1: {
                float f11;
                object = (Number)object;
                this.i = f11 = Pn1.g((Number)object);
                break;
            }
            case 0: {
                this.f = object = object.toString();
            }
        }
    }
}

