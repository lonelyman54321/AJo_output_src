/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.HorizontalSide;
import com.google.accompanist.insets.InsetsSizeModifier$WhenMappings;
import com.google.accompanist.insets.InsetsSizeModifier$measure$1;
import com.google.accompanist.insets.VerticalSide;
import com.google.accompanist.insets.WindowInsets$Type;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class InsetsSizeModifier
implements op1_1 {
    private final float additionalHeight;
    private final float additionalWidth;
    private final VerticalSide heightSide;
    private final WindowInsets$Type insetsType;
    private final HorizontalSide widthSide;

    private InsetsSizeModifier(WindowInsets$Type windowInsets$Type, HorizontalSide horizontalSide, float f5, VerticalSide verticalSide, float f6) {
        this.insetsType = windowInsets$Type;
        this.widthSide = horizontalSide;
        this.additionalWidth = f5;
        this.heightSide = verticalSide;
        this.additionalHeight = f6;
    }

    public InsetsSizeModifier(WindowInsets$Type windowInsets$Type, HorizontalSide horizontalSide, float f5, VerticalSide verticalSide, float f6, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 2;
        HorizontalSide horizontalSide2 = n4 != 0 ? null : horizontalSide;
        int n7 = n3 & 4;
        n4 = 0;
        if (n7 != 0) {
            f5 = 0.0f;
        }
        float f7 = f5;
        n7 = n3 & 8;
        VerticalSide verticalSide2 = n7 != 0 ? null : verticalSide;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            f6 = 0.0f;
        }
        this(windowInsets$Type, horizontalSide2, f7, verticalSide2, f6, null);
    }

    public /* synthetic */ InsetsSizeModifier(WindowInsets$Type windowInsets$Type, HorizontalSide horizontalSide, float f5, VerticalSide verticalSide, float f6, DefaultConstructorMarker defaultConstructorMarker) {
        this(windowInsets$Type, horizontalSide, f5, verticalSide, f6);
    }

    private final WindowInsets$Type component1() {
        return this.insetsType;
    }

    private final HorizontalSide component2() {
        return this.widthSide;
    }

    private final float component3-D9Ej5fM() {
        return this.additionalWidth;
    }

    private final VerticalSide component4() {
        return this.heightSide;
    }

    private final float component5-D9Ej5fM() {
        return this.additionalHeight;
    }

    public static /* synthetic */ InsetsSizeModifier copy---FCswI$default(InsetsSizeModifier insetsSizeModifier, WindowInsets$Type windowInsets$Type, HorizontalSide object, float f5, VerticalSide object2, float f6, int n3, Object object3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            windowInsets$Type = insetsSizeModifier.insetsType;
        }
        if ((n4 = n3 & 2) != 0) {
            object = insetsSizeModifier.widthSide;
        }
        object3 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            f5 = insetsSizeModifier.additionalWidth;
        }
        float f7 = f5;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = insetsSizeModifier.heightSide;
        }
        VerticalSide verticalSide = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            f6 = insetsSizeModifier.additionalHeight;
        }
        float f8 = f6;
        object = insetsSizeModifier;
        object2 = object3;
        f6 = f7;
        return insetsSizeModifier.copy---FCswI(windowInsets$Type, (HorizontalSide)((Object)object3), f7, verticalSide, f8);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final long getTargetConstraints-OenEA2s(Vo0 object) {
        int[] nArray;
        int n3;
        Object object2;
        int n4;
        float f5 = this.additionalWidth;
        int n7 = object.e0(f5);
        float f6 = this.additionalHeight;
        int n8 = object.e0(f6);
        Object object3 = this.widthSide;
        int n10 = -1;
        if (object3 == null) {
            n4 = -1;
            f6 = 0.0f / 0.0f;
        } else {
            object2 = InsetsSizeModifier$WhenMappings.$EnumSwitchMapping$0;
            n4 = ((Enum)object3).ordinal();
            n4 = object2[n4];
        }
        int n14 = 0;
        object2 = null;
        int n15 = 2;
        int n16 = 1;
        if (n4 != n10) {
            if (n4 != n16) {
                if (n4 != n15) {
                    object = new NoWhenBranchMatchedException();
                    throw object;
                }
                object3 = this.insetsType;
                n4 = object3.getRight();
            } else {
                object3 = this.insetsType;
                n4 = object3.getLeft();
            }
        } else {
            n4 = 0;
            f6 = 0.0f;
            object3 = null;
        }
        n4 += n7;
        VerticalSide verticalSide = this.heightSide;
        if (verticalSide == null) {
            n3 = -1;
        } else {
            nArray = InsetsSizeModifier$WhenMappings.$EnumSwitchMapping$1;
            n3 = verticalSide.ordinal();
            n3 = nArray[n3];
        }
        if (n3 != n10) {
            if (n3 != n16) {
                if (n3 != n15) {
                    object = new NoWhenBranchMatchedException();
                    throw object;
                }
                object2 = this.insetsType;
                n14 = object2.getBottom();
            } else {
                object2 = this.insetsType;
                n14 = object2.getTop();
            }
        }
        n14 += n8;
        HorizontalSide horizontalSide = this.widthSide;
        if (horizontalSide == null) {
            n3 = -1;
        } else {
            nArray = InsetsSizeModifier$WhenMappings.$EnumSwitchMapping$0;
            n3 = horizontalSide.ordinal();
            n3 = nArray[n3];
        }
        int n17 = -1 >>> 1;
        if (n3 != n10) {
            if (n3 != n16) {
                if (n3 != n15) {
                    object = new NoWhenBranchMatchedException();
                    throw object;
                }
                WindowInsets$Type windowInsets$Type = this.insetsType;
                n3 = windowInsets$Type.getRight();
            } else {
                WindowInsets$Type windowInsets$Type = this.insetsType;
                n3 = windowInsets$Type.getLeft();
            }
            n3 += n7;
        } else {
            n3 = -1 >>> 1;
        }
        Object object4 = this.heightSide;
        if (object4 == null) {
            n7 = -1;
            f5 = 0.0f / 0.0f;
        } else {
            int[] nArray2 = InsetsSizeModifier$WhenMappings.$EnumSwitchMapping$1;
            n7 = ((Enum)object4).ordinal();
            n7 = nArray2[n7];
        }
        if (n7 == n10) return f60.a(n4, n3, n14, n17);
        if (n7 != n16) {
            if (n7 != n15) {
                object = new NoWhenBranchMatchedException();
                throw object;
            }
            object4 = this.insetsType;
            n7 = object4.getBottom();
        } else {
            object4 = this.insetsType;
            n7 = object4.getTop();
        }
        n17 = n7 + n8;
        return f60.a(n4, n3, n14, n17);
    }

    public final InsetsSizeModifier copy---FCswI(WindowInsets$Type windowInsets$Type, HorizontalSide horizontalSide, float f5, VerticalSide verticalSide, float f6) {
        Intrinsics.checkNotNullParameter(windowInsets$Type, "insetsType");
        InsetsSizeModifier insetsSizeModifier = new InsetsSizeModifier(windowInsets$Type, horizontalSide, f5, verticalSide, f6, null);
        return insetsSizeModifier;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof InsetsSizeModifier;
        if (!bl3) {
            return false;
        }
        object = (InsetsSizeModifier)object;
        Object object2 = this.insetsType;
        Object object3 = ((InsetsSizeModifier)object).insetsType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.widthSide;
        object3 = ((InsetsSizeModifier)object).widthSide;
        if (object2 != object3) {
            return false;
        }
        float f5 = this.additionalWidth;
        float f6 = ((InsetsSizeModifier)object).additionalWidth;
        bl3 = xs0_0.a(f5, f6);
        if (!bl3) {
            return false;
        }
        object2 = this.heightSide;
        object3 = ((InsetsSizeModifier)object).heightSide;
        if (object2 != object3) {
            return false;
        }
        f5 = this.additionalHeight;
        float f7 = ((InsetsSizeModifier)object).additionalHeight;
        boolean bl4 = xs0_0.a(f5, f7);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public Object foldIn(Object object, Function2 function2) {
        return function2.invoke(object, this);
    }

    public Object foldOut(Object object, Function2 function2) {
        return function2.invoke(this, object);
    }

    public int hashCode() {
        float f5;
        int n3;
        WindowInsets$Type windowInsets$Type = this.insetsType;
        int n4 = windowInsets$Type.hashCode();
        int n7 = 31;
        n4 *= 31;
        Enum enum_ = this.widthSide;
        int n8 = 0;
        if (enum_ == null) {
            n3 = 0;
            f5 = 0.0f;
            enum_ = null;
        } else {
            n3 = enum_.hashCode();
        }
        n4 = (n4 + n3) * 31;
        f5 = this.additionalWidth;
        n4 = UR0.a(f5, n4, n7);
        enum_ = this.heightSide;
        if (enum_ != null) {
            n8 = enum_.hashCode();
        }
        n4 = (n4 + n8) * 31;
        return Float.floatToIntBits(this.additionalHeight) + n4;
    }

    public int maxIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        Intrinsics.checkNotNullParameter(rj1, "<this>");
        Intrinsics.checkNotNullParameter(qj1, "measurable");
        int n4 = qj1.v(n3);
        long l2 = this.getTargetConstraints-OenEA2s(rj1);
        int n7 = c60.j(l2);
        n3 = c60.h(l2);
        return f.g(n4, n7, n3);
    }

    public int maxIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        Intrinsics.checkNotNullParameter(rj1, "<this>");
        Intrinsics.checkNotNullParameter(qj1, "measurable");
        int n4 = qj1.P(n3);
        long l2 = this.getTargetConstraints-OenEA2s(rj1);
        int n7 = c60.k(l2);
        n3 = c60.i(l2);
        return f.g(n4, n7, n3);
    }

    public bl1_0 measure-3p2s80s(dl1_1 dl1_12, xk1_0 object, long l2) {
        int n3;
        int n4;
        int n7;
        int n8;
        int n10;
        Intrinsics.checkNotNullParameter(dl1_12, "$this$measure");
        Object object2 = "measurable";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        long l3 = this.getTargetConstraints-OenEA2s(dl1_12);
        HorizontalSide horizontalSide = this.widthSide;
        if (horizontalSide != null) {
            n10 = c60.k(l3);
        } else {
            n10 = c60.k(l2);
            if (n10 > (n8 = c60.i(l3))) {
                n10 = n8;
            }
        }
        HorizontalSide horizontalSide2 = this.widthSide;
        if (horizontalSide2 != null) {
            n8 = c60.i(l3);
        } else {
            n8 = c60.i(l2);
            if (n8 < (n7 = c60.k(l3))) {
                n8 = n7;
            }
        }
        VerticalSide verticalSide = this.heightSide;
        if (verticalSide != null) {
            n7 = c60.j(l3);
        } else {
            int n14;
            n7 = c60.j(l2);
            if (n7 > (n14 = c60.h(l3))) {
                n7 = n14;
            }
        }
        VerticalSide verticalSide2 = this.heightSide;
        if (verticalSide2 != null) {
            n4 = c60.h(l3);
        } else {
            n4 = c60.h(l2);
            if (n4 < (n3 = c60.j(l3))) {
                n4 = n3;
            }
        }
        l2 = f60.a(n10, n8, n7, n4);
        object = object.Q(l2);
        n4 = ((Ns2)object).a;
        n3 = ((Ns2)object).b;
        object2 = new InsetsSizeModifier$measure$1((Ns2)object);
        return cl1_0.a(dl1_12, n4, n3, (Function1)object2);
    }

    public int minIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        Intrinsics.checkNotNullParameter(rj1, "<this>");
        Intrinsics.checkNotNullParameter(qj1, "measurable");
        int n4 = qj1.I(n3);
        long l2 = this.getTargetConstraints-OenEA2s(rj1);
        int n7 = c60.j(l2);
        n3 = c60.h(l2);
        return f.g(n4, n7, n3);
    }

    public int minIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        Intrinsics.checkNotNullParameter(rj1, "<this>");
        Intrinsics.checkNotNullParameter(qj1, "measurable");
        int n4 = qj1.N(n3);
        long l2 = this.getTargetConstraints-OenEA2s(rj1);
        int n7 = c60.k(l2);
        n3 = c60.i(l2);
        return f.g(n4, n7, n3);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("InsetsSizeModifier(insetsType=");
        Object object = this.insetsType;
        stringBuilder.append(object);
        stringBuilder.append(", widthSide=");
        object = this.widthSide;
        stringBuilder.append(object);
        stringBuilder.append(", additionalWidth=");
        object = xs0_0.b(this.additionalWidth);
        stringBuilder.append(object);
        stringBuilder.append(", heightSide=");
        object = this.heightSide;
        stringBuilder.append(object);
        stringBuilder.append(", additionalHeight=");
        object = xs0_0.b(this.additionalHeight);
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

