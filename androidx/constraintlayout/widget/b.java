/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.content.res.XmlResourceParser
 *  android.graphics.drawable.ColorDrawable
 *  android.util.AttributeSet
 *  android.util.SparseIntArray
 *  android.util.TypedValue
 *  android.util.Xml
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.constraintlayout.widget.Guideline;
import androidx.constraintlayout.widget.R$id;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.b$a;
import androidx.constraintlayout.widget.b$a$a;
import androidx.constraintlayout.widget.b$b;
import androidx.constraintlayout.widget.b$c;
import androidx.constraintlayout.widget.b$d;
import androidx.constraintlayout.widget.b$e;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class b {
    public static final int[] h;
    public static final SparseIntArray i;
    public static final SparseIntArray j;
    public String a;
    public String b = "";
    public String[] c;
    public int d;
    public final HashMap e;
    public boolean f;
    public final HashMap g;

    static {
        SparseIntArray sparseIntArray;
        SparseIntArray sparseIntArray2;
        int n3 = 4;
        int n4 = 8;
        h = new int[]{0, n3, n4};
        i = sparseIntArray2 = new SparseIntArray();
        j = sparseIntArray = new SparseIntArray();
        int n7 = R$styleable.Constraint_layout_constraintLeft_toLeftOf;
        sparseIntArray2.append(n7, 25);
        n7 = R$styleable.Constraint_layout_constraintLeft_toRightOf;
        sparseIntArray2.append(n7, 26);
        n7 = R$styleable.Constraint_layout_constraintRight_toLeftOf;
        sparseIntArray2.append(n7, 29);
        n7 = R$styleable.Constraint_layout_constraintRight_toRightOf;
        sparseIntArray2.append(n7, 30);
        n7 = R$styleable.Constraint_layout_constraintTop_toTopOf;
        sparseIntArray2.append(n7, 36);
        n7 = R$styleable.Constraint_layout_constraintTop_toBottomOf;
        sparseIntArray2.append(n7, 35);
        n7 = R$styleable.Constraint_layout_constraintBottom_toTopOf;
        sparseIntArray2.append(n7, n3);
        n3 = R$styleable.Constraint_layout_constraintBottom_toBottomOf;
        sparseIntArray2.append(n3, 3);
        n3 = R$styleable.Constraint_layout_constraintBaseline_toBaselineOf;
        sparseIntArray2.append(n3, 1);
        n3 = R$styleable.Constraint_layout_constraintBaseline_toTopOf;
        sparseIntArray2.append(n3, 91);
        n3 = R$styleable.Constraint_layout_constraintBaseline_toBottomOf;
        sparseIntArray2.append(n3, 92);
        n3 = R$styleable.Constraint_layout_editor_absoluteX;
        n7 = 6;
        sparseIntArray2.append(n3, n7);
        n3 = R$styleable.Constraint_layout_editor_absoluteY;
        int n8 = 7;
        sparseIntArray2.append(n3, n8);
        n3 = R$styleable.Constraint_layout_constraintGuide_begin;
        sparseIntArray2.append(n3, 17);
        n3 = R$styleable.Constraint_layout_constraintGuide_end;
        sparseIntArray2.append(n3, 18);
        n3 = R$styleable.Constraint_layout_constraintGuide_percent;
        sparseIntArray2.append(n3, 19);
        n3 = R$styleable.Constraint_guidelineUseRtl;
        sparseIntArray2.append(n3, 99);
        n3 = R$styleable.Constraint_android_orientation;
        int n10 = 27;
        sparseIntArray2.append(n3, n10);
        n3 = R$styleable.Constraint_layout_constraintStart_toEndOf;
        sparseIntArray2.append(n3, 32);
        n3 = R$styleable.Constraint_layout_constraintStart_toStartOf;
        sparseIntArray2.append(n3, 33);
        n3 = R$styleable.Constraint_layout_constraintEnd_toStartOf;
        sparseIntArray2.append(n3, 10);
        n3 = R$styleable.Constraint_layout_constraintEnd_toEndOf;
        sparseIntArray2.append(n3, 9);
        n3 = R$styleable.Constraint_layout_goneMarginLeft;
        int n14 = 13;
        sparseIntArray2.append(n3, n14);
        n3 = R$styleable.Constraint_layout_goneMarginTop;
        int n15 = 16;
        sparseIntArray2.append(n3, n15);
        n3 = R$styleable.Constraint_layout_goneMarginRight;
        int n16 = 14;
        sparseIntArray2.append(n3, n16);
        n3 = R$styleable.Constraint_layout_goneMarginBottom;
        int n17 = 11;
        sparseIntArray2.append(n3, n17);
        n3 = R$styleable.Constraint_layout_goneMarginStart;
        int n18 = 15;
        sparseIntArray2.append(n3, n18);
        n3 = R$styleable.Constraint_layout_goneMarginEnd;
        int n19 = 12;
        sparseIntArray2.append(n3, n19);
        n3 = R$styleable.Constraint_layout_constraintVertical_weight;
        int n20 = 40;
        sparseIntArray2.append(n3, n20);
        n3 = R$styleable.Constraint_layout_constraintHorizontal_weight;
        int n21 = 39;
        sparseIntArray2.append(n3, n21);
        n3 = R$styleable.Constraint_layout_constraintHorizontal_chainStyle;
        sparseIntArray2.append(n3, 41);
        n3 = R$styleable.Constraint_layout_constraintVertical_chainStyle;
        sparseIntArray2.append(n3, 42);
        n3 = R$styleable.Constraint_layout_constraintHorizontal_bias;
        sparseIntArray2.append(n3, 20);
        n3 = R$styleable.Constraint_layout_constraintVertical_bias;
        sparseIntArray2.append(n3, 37);
        n3 = R$styleable.Constraint_layout_constraintDimensionRatio;
        sparseIntArray2.append(n3, 5);
        n3 = R$styleable.Constraint_layout_constraintLeft_creator;
        int n22 = 87;
        sparseIntArray2.append(n3, n22);
        n3 = R$styleable.Constraint_layout_constraintTop_creator;
        sparseIntArray2.append(n3, n22);
        n3 = R$styleable.Constraint_layout_constraintRight_creator;
        sparseIntArray2.append(n3, n22);
        n3 = R$styleable.Constraint_layout_constraintBottom_creator;
        sparseIntArray2.append(n3, n22);
        n3 = R$styleable.Constraint_layout_constraintBaseline_creator;
        sparseIntArray2.append(n3, n22);
        n3 = R$styleable.Constraint_android_layout_marginLeft;
        sparseIntArray2.append(n3, 24);
        n3 = R$styleable.Constraint_android_layout_marginRight;
        sparseIntArray2.append(n3, 28);
        n3 = R$styleable.Constraint_android_layout_marginStart;
        n22 = 31;
        sparseIntArray2.append(n3, n22);
        n3 = R$styleable.Constraint_android_layout_marginEnd;
        sparseIntArray2.append(n3, n4);
        n3 = R$styleable.Constraint_android_layout_marginTop;
        sparseIntArray2.append(n3, 34);
        n3 = R$styleable.Constraint_android_layout_marginBottom;
        sparseIntArray2.append(n3, 2);
        n3 = R$styleable.Constraint_android_layout_width;
        sparseIntArray2.append(n3, 23);
        n3 = R$styleable.Constraint_android_layout_height;
        sparseIntArray2.append(n3, 21);
        n3 = R$styleable.Constraint_layout_constraintWidth;
        sparseIntArray2.append(n3, 95);
        n3 = R$styleable.Constraint_layout_constraintHeight;
        sparseIntArray2.append(n3, 96);
        n3 = R$styleable.Constraint_android_visibility;
        sparseIntArray2.append(n3, 22);
        n3 = R$styleable.Constraint_android_alpha;
        sparseIntArray2.append(n3, 43);
        n3 = R$styleable.Constraint_android_elevation;
        sparseIntArray2.append(n3, 44);
        n3 = R$styleable.Constraint_android_rotationX;
        sparseIntArray2.append(n3, 45);
        n3 = R$styleable.Constraint_android_rotationY;
        sparseIntArray2.append(n3, 46);
        n3 = R$styleable.Constraint_android_rotation;
        sparseIntArray2.append(n3, 60);
        n3 = R$styleable.Constraint_android_scaleX;
        sparseIntArray2.append(n3, 47);
        n3 = R$styleable.Constraint_android_scaleY;
        sparseIntArray2.append(n3, 48);
        n3 = R$styleable.Constraint_android_transformPivotX;
        sparseIntArray2.append(n3, 49);
        n3 = R$styleable.Constraint_android_transformPivotY;
        sparseIntArray2.append(n3, 50);
        n3 = R$styleable.Constraint_android_translationX;
        sparseIntArray2.append(n3, 51);
        n3 = R$styleable.Constraint_android_translationY;
        sparseIntArray2.append(n3, 52);
        n3 = R$styleable.Constraint_android_translationZ;
        sparseIntArray2.append(n3, 53);
        n3 = R$styleable.Constraint_layout_constraintWidth_default;
        sparseIntArray2.append(n3, 54);
        n3 = R$styleable.Constraint_layout_constraintHeight_default;
        sparseIntArray2.append(n3, 55);
        n3 = R$styleable.Constraint_layout_constraintWidth_max;
        sparseIntArray2.append(n3, 56);
        n3 = R$styleable.Constraint_layout_constraintHeight_max;
        sparseIntArray2.append(n3, 57);
        n3 = R$styleable.Constraint_layout_constraintWidth_min;
        sparseIntArray2.append(n3, 58);
        n3 = R$styleable.Constraint_layout_constraintHeight_min;
        sparseIntArray2.append(n3, 59);
        n3 = R$styleable.Constraint_layout_constraintCircle;
        sparseIntArray2.append(n3, 61);
        n3 = R$styleable.Constraint_layout_constraintCircleRadius;
        sparseIntArray2.append(n3, 62);
        n3 = R$styleable.Constraint_layout_constraintCircleAngle;
        sparseIntArray2.append(n3, 63);
        n3 = R$styleable.Constraint_animateRelativeTo;
        sparseIntArray2.append(n3, 64);
        n3 = R$styleable.Constraint_transitionEasing;
        sparseIntArray2.append(n3, 65);
        n3 = R$styleable.Constraint_drawPath;
        sparseIntArray2.append(n3, 66);
        n3 = R$styleable.Constraint_transitionPathRotate;
        sparseIntArray2.append(n3, 67);
        n3 = R$styleable.Constraint_motionStagger;
        sparseIntArray2.append(n3, 79);
        n3 = R$styleable.Constraint_android_id;
        sparseIntArray2.append(n3, 38);
        n3 = R$styleable.Constraint_motionProgress;
        sparseIntArray2.append(n3, 68);
        n3 = R$styleable.Constraint_layout_constraintWidth_percent;
        sparseIntArray2.append(n3, 69);
        n3 = R$styleable.Constraint_layout_constraintHeight_percent;
        sparseIntArray2.append(n3, 70);
        n3 = R$styleable.Constraint_layout_wrapBehaviorInParent;
        sparseIntArray2.append(n3, 97);
        n3 = R$styleable.Constraint_chainUseRtl;
        sparseIntArray2.append(n3, 71);
        n3 = R$styleable.Constraint_barrierDirection;
        sparseIntArray2.append(n3, 72);
        n3 = R$styleable.Constraint_barrierMargin;
        sparseIntArray2.append(n3, 73);
        n3 = R$styleable.Constraint_constraint_referenced_ids;
        sparseIntArray2.append(n3, 74);
        n3 = R$styleable.Constraint_barrierAllowsGoneWidgets;
        sparseIntArray2.append(n3, 75);
        n3 = R$styleable.Constraint_pathMotionArc;
        sparseIntArray2.append(n3, 76);
        n3 = R$styleable.Constraint_layout_constraintTag;
        sparseIntArray2.append(n3, 77);
        n3 = R$styleable.Constraint_visibilityMode;
        sparseIntArray2.append(n3, 78);
        n3 = R$styleable.Constraint_layout_constrainedWidth;
        sparseIntArray2.append(n3, 80);
        n3 = R$styleable.Constraint_layout_constrainedHeight;
        sparseIntArray2.append(n3, 81);
        n3 = R$styleable.Constraint_polarRelativeTo;
        sparseIntArray2.append(n3, 82);
        n3 = R$styleable.Constraint_transformPivotTarget;
        sparseIntArray2.append(n3, 83);
        n3 = R$styleable.Constraint_quantizeMotionSteps;
        sparseIntArray2.append(n3, 84);
        n3 = R$styleable.Constraint_quantizeMotionPhase;
        sparseIntArray2.append(n3, 85);
        n3 = R$styleable.Constraint_quantizeMotionInterpolator;
        sparseIntArray2.append(n3, 86);
        int n24 = R$styleable.ConstraintOverride_layout_editor_absoluteY;
        sparseIntArray.append(n24, n7);
        n24 = R$styleable.ConstraintOverride_layout_editor_absoluteY;
        sparseIntArray.append(n24, n8);
        n24 = R$styleable.ConstraintOverride_android_orientation;
        sparseIntArray.append(n24, n10);
        n24 = R$styleable.ConstraintOverride_layout_goneMarginLeft;
        sparseIntArray.append(n24, n14);
        n24 = R$styleable.ConstraintOverride_layout_goneMarginTop;
        sparseIntArray.append(n24, n15);
        n24 = R$styleable.ConstraintOverride_layout_goneMarginRight;
        sparseIntArray.append(n24, n16);
        n24 = R$styleable.ConstraintOverride_layout_goneMarginBottom;
        sparseIntArray.append(n24, n17);
        n24 = R$styleable.ConstraintOverride_layout_goneMarginStart;
        sparseIntArray.append(n24, n18);
        n24 = R$styleable.ConstraintOverride_layout_goneMarginEnd;
        sparseIntArray.append(n24, n19);
        n24 = R$styleable.ConstraintOverride_layout_constraintVertical_weight;
        sparseIntArray.append(n24, n20);
        n24 = R$styleable.ConstraintOverride_layout_constraintHorizontal_weight;
        sparseIntArray.append(n24, n21);
        n24 = R$styleable.ConstraintOverride_layout_constraintHorizontal_chainStyle;
        sparseIntArray.append(n24, 41);
        n24 = R$styleable.ConstraintOverride_layout_constraintVertical_chainStyle;
        sparseIntArray.append(n24, 42);
        n24 = R$styleable.ConstraintOverride_layout_constraintHorizontal_bias;
        sparseIntArray.append(n24, 20);
        n24 = R$styleable.ConstraintOverride_layout_constraintVertical_bias;
        sparseIntArray.append(n24, 37);
        n24 = R$styleable.ConstraintOverride_layout_constraintDimensionRatio;
        sparseIntArray.append(n24, 5);
        n24 = R$styleable.ConstraintOverride_layout_constraintLeft_creator;
        n3 = 87;
        sparseIntArray.append(n24, n3);
        n24 = R$styleable.ConstraintOverride_layout_constraintTop_creator;
        sparseIntArray.append(n24, n3);
        n24 = R$styleable.ConstraintOverride_layout_constraintRight_creator;
        sparseIntArray.append(n24, n3);
        n24 = R$styleable.ConstraintOverride_layout_constraintBottom_creator;
        sparseIntArray.append(n24, n3);
        n24 = R$styleable.ConstraintOverride_layout_constraintBaseline_creator;
        sparseIntArray.append(n24, n3);
        n24 = R$styleable.ConstraintOverride_android_layout_marginLeft;
        sparseIntArray.append(n24, 24);
        n24 = R$styleable.ConstraintOverride_android_layout_marginRight;
        sparseIntArray.append(n24, 28);
        n24 = R$styleable.ConstraintOverride_android_layout_marginStart;
        sparseIntArray.append(n24, n22);
        n24 = R$styleable.ConstraintOverride_android_layout_marginEnd;
        sparseIntArray.append(n24, 8);
        n24 = R$styleable.ConstraintOverride_android_layout_marginTop;
        sparseIntArray.append(n24, 34);
        n24 = R$styleable.ConstraintOverride_android_layout_marginBottom;
        sparseIntArray.append(n24, 2);
        n24 = R$styleable.ConstraintOverride_android_layout_width;
        sparseIntArray.append(n24, 23);
        n24 = R$styleable.ConstraintOverride_android_layout_height;
        sparseIntArray.append(n24, 21);
        n24 = R$styleable.ConstraintOverride_layout_constraintWidth;
        sparseIntArray.append(n24, 95);
        n24 = R$styleable.ConstraintOverride_layout_constraintHeight;
        sparseIntArray.append(n24, 96);
        n24 = R$styleable.ConstraintOverride_android_visibility;
        sparseIntArray.append(n24, 22);
        n24 = R$styleable.ConstraintOverride_android_alpha;
        sparseIntArray.append(n24, 43);
        n24 = R$styleable.ConstraintOverride_android_elevation;
        sparseIntArray.append(n24, 44);
        n24 = R$styleable.ConstraintOverride_android_rotationX;
        sparseIntArray.append(n24, 45);
        n24 = R$styleable.ConstraintOverride_android_rotationY;
        sparseIntArray.append(n24, 46);
        n24 = R$styleable.ConstraintOverride_android_rotation;
        sparseIntArray.append(n24, 60);
        n24 = R$styleable.ConstraintOverride_android_scaleX;
        sparseIntArray.append(n24, 47);
        n24 = R$styleable.ConstraintOverride_android_scaleY;
        sparseIntArray.append(n24, 48);
        n24 = R$styleable.ConstraintOverride_android_transformPivotX;
        sparseIntArray.append(n24, 49);
        n24 = R$styleable.ConstraintOverride_android_transformPivotY;
        sparseIntArray.append(n24, 50);
        n24 = R$styleable.ConstraintOverride_android_translationX;
        sparseIntArray.append(n24, 51);
        n24 = R$styleable.ConstraintOverride_android_translationY;
        sparseIntArray.append(n24, 52);
        n24 = R$styleable.ConstraintOverride_android_translationZ;
        sparseIntArray.append(n24, 53);
        n24 = R$styleable.ConstraintOverride_layout_constraintWidth_default;
        sparseIntArray.append(n24, 54);
        n24 = R$styleable.ConstraintOverride_layout_constraintHeight_default;
        sparseIntArray.append(n24, 55);
        n24 = R$styleable.ConstraintOverride_layout_constraintWidth_max;
        sparseIntArray.append(n24, 56);
        n24 = R$styleable.ConstraintOverride_layout_constraintHeight_max;
        sparseIntArray.append(n24, 57);
        n24 = R$styleable.ConstraintOverride_layout_constraintWidth_min;
        sparseIntArray.append(n24, 58);
        n24 = R$styleable.ConstraintOverride_layout_constraintHeight_min;
        sparseIntArray.append(n24, 59);
        n24 = R$styleable.ConstraintOverride_layout_constraintCircleRadius;
        sparseIntArray.append(n24, 62);
        n24 = R$styleable.ConstraintOverride_layout_constraintCircleAngle;
        sparseIntArray.append(n24, 63);
        n24 = R$styleable.ConstraintOverride_animateRelativeTo;
        sparseIntArray.append(n24, 64);
        n24 = R$styleable.ConstraintOverride_transitionEasing;
        sparseIntArray.append(n24, 65);
        n24 = R$styleable.ConstraintOverride_drawPath;
        sparseIntArray.append(n24, 66);
        n24 = R$styleable.ConstraintOverride_transitionPathRotate;
        sparseIntArray.append(n24, 67);
        n24 = R$styleable.ConstraintOverride_motionStagger;
        sparseIntArray.append(n24, 79);
        n24 = R$styleable.ConstraintOverride_android_id;
        sparseIntArray.append(n24, 38);
        n24 = R$styleable.ConstraintOverride_motionTarget;
        sparseIntArray.append(n24, 98);
        n24 = R$styleable.ConstraintOverride_motionProgress;
        sparseIntArray.append(n24, 68);
        n24 = R$styleable.ConstraintOverride_layout_constraintWidth_percent;
        sparseIntArray.append(n24, 69);
        n24 = R$styleable.ConstraintOverride_layout_constraintHeight_percent;
        sparseIntArray.append(n24, 70);
        n24 = R$styleable.ConstraintOverride_chainUseRtl;
        sparseIntArray.append(n24, 71);
        n24 = R$styleable.ConstraintOverride_barrierDirection;
        sparseIntArray.append(n24, 72);
        n24 = R$styleable.ConstraintOverride_barrierMargin;
        sparseIntArray.append(n24, 73);
        n24 = R$styleable.ConstraintOverride_constraint_referenced_ids;
        sparseIntArray.append(n24, 74);
        n24 = R$styleable.ConstraintOverride_barrierAllowsGoneWidgets;
        sparseIntArray.append(n24, 75);
        n24 = R$styleable.ConstraintOverride_pathMotionArc;
        sparseIntArray.append(n24, 76);
        n24 = R$styleable.ConstraintOverride_layout_constraintTag;
        sparseIntArray.append(n24, 77);
        n24 = R$styleable.ConstraintOverride_visibilityMode;
        sparseIntArray.append(n24, 78);
        n24 = R$styleable.ConstraintOverride_layout_constrainedWidth;
        sparseIntArray.append(n24, 80);
        n24 = R$styleable.ConstraintOverride_layout_constrainedHeight;
        sparseIntArray.append(n24, 81);
        n24 = R$styleable.ConstraintOverride_polarRelativeTo;
        sparseIntArray.append(n24, 82);
        n24 = R$styleable.ConstraintOverride_transformPivotTarget;
        sparseIntArray.append(n24, 83);
        n24 = R$styleable.ConstraintOverride_quantizeMotionSteps;
        sparseIntArray.append(n24, 84);
        n24 = R$styleable.ConstraintOverride_quantizeMotionPhase;
        sparseIntArray.append(n24, 85);
        n24 = R$styleable.ConstraintOverride_quantizeMotionInterpolator;
        sparseIntArray.append(n24, 86);
        n24 = R$styleable.ConstraintOverride_layout_wrapBehaviorInParent;
        sparseIntArray.append(n24, 97);
    }

    public b() {
        HashMap hashMap;
        String[] stringArray = new String[]{};
        this.c = stringArray;
        this.d = 0;
        this.e = hashMap = new HashMap();
        this.f = true;
        this.g = hashMap = new HashMap();
    }

    public static b$a d(Context context, XmlResourceParser xmlResourceParser) {
        xmlResourceParser = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
        b$a b$a = new b$a();
        int[] nArray = R$styleable.ConstraintOverride;
        context = context.obtainStyledAttributes((AttributeSet)xmlResourceParser, nArray);
        androidx.constraintlayout.widget.b.q(b$a, (TypedArray)context);
        context.recycle();
        return b$a;
    }

    public static int[] h(Barrier barrier, String stringArray) {
        int n3;
        stringArray = stringArray.split(",");
        Context context = barrier.getContext();
        int n4 = stringArray.length;
        int[] nArray = new int[n4];
        int n7 = 0;
        for (int i3 = 0; i3 < (n3 = stringArray.length); ++i3) {
            int n8;
            Object object = stringArray[i3].trim();
            Object object2 = R$id.class;
            object2 = ((Class)object2).getField((String)object);
            boolean bl2 = false;
            Object object3 = null;
            try {
                n8 = ((Field)object2).getInt(null);
            }
            catch (Exception exception) {
                n8 = 0;
                object2 = null;
            }
            if (n8 == 0) {
                object2 = context.getResources();
                object3 = "id";
                String string2 = context.getPackageName();
                n8 = object2.getIdentifier((String)object, (String)object3, string2);
            }
            if (n8 == 0 && (bl2 = barrier.isInEditMode()) && (bl2 = (object3 = barrier.getParent()) instanceof ConstraintLayout) && (object = ((ConstraintLayout)((Object)(object3 = (ConstraintLayout)barrier.getParent()))).getDesignInformation(0, object)) != null && (bl2 = object instanceof Integer)) {
                object = (Integer)object;
                n8 = (Integer)object;
            }
            n3 = n7 + 1;
            nArray[n7] = n8;
            n7 = n3;
        }
        int n10 = stringArray.length;
        if (n7 != n10) {
            nArray = Arrays.copyOf(nArray, n7);
        }
        return nArray;
    }

    public static b$a i(Context context, AttributeSet object, boolean bl2) {
        b$a b$a = new b$a();
        int[] nArray = bl2 ? R$styleable.ConstraintOverride : R$styleable.Constraint;
        context = context.obtainStyledAttributes(object, nArray);
        if (bl2) {
            androidx.constraintlayout.widget.b.q(b$a, (TypedArray)context);
        } else {
            Object object2;
            int n3 = context.getIndexCount();
            bl2 = false;
            int n4 = 0;
            nArray = null;
            while (true) {
                object2 = b$a.e;
                if (n4 >= n3) break;
                int n7 = context.getIndex(n4);
                int n8 = R$styleable.Constraint_android_id;
                int n10 = 1;
                b$d b$d = b$a.c;
                b$e b$e = b$a.f;
                b$c b$c = b$a.d;
                if (n7 != n8 && (n8 = R$styleable.Constraint_android_layout_marginStart) != n7 && (n8 = R$styleable.Constraint_android_layout_marginEnd) != n7) {
                    b$c.a = n10;
                    ((b$b)object2).b = n10;
                    b$d.a = n10;
                    b$e.a = n10;
                }
                SparseIntArray sparseIntArray = i;
                int n14 = sparseIntArray.get(n7);
                float f5 = 1.0f;
                int n15 = 3;
                switch (n14) {
                    default: {
                        Integer.toHexString(n7);
                        sparseIntArray.get(n7);
                        break;
                    }
                    case 97: {
                        n8 = ((b$b)object2).p0;
                        ((b$b)object2).p0 = n7 = context.getInt(n7, n8);
                        break;
                    }
                    case 96: {
                        androidx.constraintlayout.widget.b.o(object2, (TypedArray)context, n7, n10);
                        break;
                    }
                    case 95: {
                        androidx.constraintlayout.widget.b.o(object2, (TypedArray)context, n7, 0);
                        break;
                    }
                    case 94: {
                        n8 = ((b$b)object2).T;
                        ((b$b)object2).T = n7 = context.getDimensionPixelSize(n7, n8);
                        break;
                    }
                    case 93: {
                        n8 = ((b$b)object2).M;
                        ((b$b)object2).M = n7 = context.getDimensionPixelSize(n7, n8);
                        break;
                    }
                    case 92: {
                        n8 = ((b$b)object2).s;
                        ((b$b)object2).s = n7 = androidx.constraintlayout.widget.b.n((TypedArray)context, n7, n8);
                        break;
                    }
                    case 91: {
                        n8 = ((b$b)object2).r;
                        ((b$b)object2).r = n7 = androidx.constraintlayout.widget.b.n((TypedArray)context, n7, n8);
                        break;
                    }
                    case 87: {
                        Integer.toHexString(n7);
                        sparseIntArray.get(n7);
                        break;
                    }
                    case 86: {
                        object2 = context.peekValue(n7);
                        Object object3 = ((TypedValue)object2).type;
                        n8 = -2;
                        float f6 = 0.0f / 0.0f;
                        Object object4 = -1;
                        if (object3 == n10) {
                            b$c.m = object3 = context.getResourceId(n7, object4);
                            if (object3 == object4) break;
                            b$c.l = n8;
                            break;
                        }
                        if (object3 == n15) {
                            b$c.k = object2 = context.getString(n7);
                            String string2 = "/";
                            object3 = ((String)object2).indexOf(string2);
                            if (object3 > 0) {
                                b$c.m = object3 = context.getResourceId(n7, object4);
                                b$c.l = n8;
                                break;
                            }
                            b$c.l = object4;
                            break;
                        }
                        object3 = b$c.m;
                        b$c.l = object3 = context.getInteger(n7, object3);
                        break;
                    }
                    case 85: {
                        float f7 = b$c.i;
                        b$c.i = f7 = context.getFloat(n7, f7);
                        break;
                    }
                    case 84: {
                        Object object3 = b$c.j;
                        b$c.j = object3 = context.getInteger(n7, object3);
                        break;
                    }
                    case 83: {
                        Object object3 = b$e.i;
                        b$e.i = object3 = androidx.constraintlayout.widget.b.n((TypedArray)context, n7, object3);
                        break;
                    }
                    case 82: {
                        Object object3 = b$c.c;
                        b$c.c = object3 = context.getInteger(n7, object3);
                        break;
                    }
                    case 81: {
                        n8 = (int)(((b$b)object2).n0 ? 1 : 0);
                        n7 = (int)(context.getBoolean(n7, n8 != 0) ? 1 : 0);
                        ((b$b)object2).n0 = n7;
                        break;
                    }
                    case 80: {
                        n8 = (int)(((b$b)object2).m0 ? 1 : 0);
                        n7 = (int)(context.getBoolean(n7, n8 != 0) ? 1 : 0);
                        ((b$b)object2).m0 = n7;
                        break;
                    }
                    case 79: {
                        float f7 = b$c.g;
                        b$c.g = f7 = context.getFloat(n7, f7);
                        break;
                    }
                    case 78: {
                        Object object3 = b$d.c;
                        b$d.c = object3 = context.getInt(n7, object3);
                        break;
                    }
                    case 77: {
                        Object object5 = context.getString(n7);
                        ((b$b)object2).l0 = object5;
                        break;
                    }
                    case 76: {
                        Object object3 = b$c.e;
                        b$c.e = object3 = context.getInt(n7, object3);
                        break;
                    }
                    case 75: {
                        n8 = (int)(((b$b)object2).o0 ? 1 : 0);
                        n7 = (int)(context.getBoolean(n7, n8 != 0) ? 1 : 0);
                        ((b$b)object2).o0 = n7;
                        break;
                    }
                    case 74: {
                        Object object5 = context.getString(n7);
                        ((b$b)object2).k0 = object5;
                        break;
                    }
                    case 73: {
                        n8 = ((b$b)object2).h0;
                        ((b$b)object2).h0 = n7 = context.getDimensionPixelSize(n7, n8);
                        break;
                    }
                    case 72: {
                        n8 = ((b$b)object2).g0;
                        ((b$b)object2).g0 = n7 = context.getInt(n7, n8);
                        break;
                    }
                    case 70: {
                        float f8;
                        ((b$b)object2).f0 = f8 = context.getFloat(n7, f5);
                        break;
                    }
                    case 69: {
                        float f8;
                        ((b$b)object2).e0 = f8 = context.getFloat(n7, f5);
                        break;
                    }
                    case 68: {
                        float f7 = b$d.e;
                        b$d.e = f7 = context.getFloat(n7, f7);
                        break;
                    }
                    case 67: {
                        float f7 = b$c.h;
                        b$c.h = f7 = context.getFloat(n7, f7);
                        break;
                    }
                    case 66: {
                        Object object3;
                        b$c.f = object3 = context.getInt(n7, 0);
                        break;
                    }
                    case 65: {
                        object2 = context.peekValue(n7);
                        Object object3 = ((TypedValue)object2).type;
                        if (object3 == n15) {
                            object2 = context.getString(n7);
                            b$c.d = object2;
                            break;
                        }
                        object2 = bx0_0.c;
                        n7 = context.getInteger(n7, 0);
                        object2 = object2[n7];
                        b$c.d = object2;
                        break;
                    }
                    case 64: {
                        Object object3 = b$c.b;
                        b$c.b = object3 = androidx.constraintlayout.widget.b.n((TypedArray)context, n7, object3);
                        break;
                    }
                    case 63: {
                        float f8;
                        float f6 = ((b$b)object2).C;
                        ((b$b)object2).C = f8 = context.getFloat(n7, f6);
                        break;
                    }
                    case 62: {
                        n8 = ((b$b)object2).B;
                        ((b$b)object2).B = n7 = context.getDimensionPixelSize(n7, n8);
                        break;
                    }
                    case 61: {
                        n8 = ((b$b)object2).A;
                        ((b$b)object2).A = n7 = androidx.constraintlayout.widget.b.n((TypedArray)context, n7, n8);
                        break;
                    }
                    case 60: {
                        float f7 = b$e.b;
                        b$e.b = f7 = context.getFloat(n7, f7);
                        break;
                    }
                    case 59: {
                        n8 = ((b$b)object2).d0;
                        ((b$b)object2).d0 = n7 = context.getDimensionPixelSize(n7, n8);
                        break;
                    }
                    case 58: {
                        n8 = ((b$b)object2).c0;
                        ((b$b)object2).c0 = n7 = context.getDimensionPixelSize(n7, n8);
                        break;
                    }
                    case 57: {
                        n8 = ((b$b)object2).b0;
                        ((b$b)object2).b0 = n7 = context.getDimensionPixelSize(n7, n8);
                        break;
                    }
                    case 56: {
                        n8 = ((b$b)object2).a0;
                        ((b$b)object2).a0 = n7 = context.getDimensionPixelSize(n7, n8);
                        break;
                    }
                    case 55: {
                        n8 = ((b$b)object2).Z;
                        ((b$b)object2).Z = n7 = context.getInt(n7, n8);
                        break;
                    }
                    case 54: {
                        n8 = ((b$b)object2).Y;
                        ((b$b)object2).Y = n7 = context.getInt(n7, n8);
                        break;
                    }
                    case 53: {
                        float f7 = b$e.l;
                        b$e.l = f7 = context.getDimension(n7, f7);
                        break;
                    }
                    case 52: {
                        float f7 = b$e.k;
                        b$e.k = f7 = context.getDimension(n7, f7);
                        break;
                    }
                    case 51: {
                        float f7 = b$e.j;
                        b$e.j = f7 = context.getDimension(n7, f7);
                        break;
                    }
                    case 50: {
                        float f7 = b$e.h;
                        b$e.h = f7 = context.getDimension(n7, f7);
                        break;
                    }
                    case 49: {
                        float f7 = b$e.g;
                        b$e.g = f7 = context.getDimension(n7, f7);
                        break;
                    }
                    case 48: {
                        float f7 = b$e.f;
                        b$e.f = f7 = context.getFloat(n7, f7);
                        break;
                    }
                    case 47: {
                        float f7 = b$e.e;
                        b$e.e = f7 = context.getFloat(n7, f7);
                        break;
                    }
                    case 46: {
                        float f7 = b$e.d;
                        b$e.d = f7 = context.getFloat(n7, f7);
                        break;
                    }
                    case 45: {
                        float f7 = b$e.c;
                        b$e.c = f7 = context.getFloat(n7, f7);
                        break;
                    }
                    case 44: {
                        b$e.m = n10;
                        float f7 = b$e.n;
                        b$e.n = f7 = context.getDimension(n7, f7);
                        break;
                    }
                    case 43: {
                        float f7 = b$d.d;
                        b$d.d = f7 = context.getFloat(n7, f7);
                        break;
                    }
                    case 42: {
                        n8 = ((b$b)object2).X;
                        ((b$b)object2).X = n7 = context.getInt(n7, n8);
                        break;
                    }
                    case 41: {
                        n8 = ((b$b)object2).W;
                        ((b$b)object2).W = n7 = context.getInt(n7, n8);
                        break;
                    }
                    case 40: {
                        float f8;
                        float f6 = ((b$b)object2).U;
                        ((b$b)object2).U = f8 = context.getFloat(n7, f6);
                        break;
                    }
                    case 39: {
                        float f8;
                        float f6 = ((b$b)object2).V;
                        ((b$b)object2).V = f8 = context.getFloat(n7, f6);
                        break;
                    }
                    case 38: {
                        Object object3 = b$a.a;
                        b$a.a = object3 = context.getResourceId(n7, object3);
                        break;
                    }
                    case 37: {
                        float f8;
                        float f6 = ((b$b)object2).y;
                        ((b$b)object2).y = f8 = context.getFloat(n7, f6);
                        break;
                    }
                    case 36: {
                        n8 = ((b$b)object2).m;
                        ((b$b)object2).m = n7 = androidx.constraintlayout.widget.b.n((TypedArray)context, n7, n8);
                        break;
                    }
                    case 35: {
                        n8 = ((b$b)object2).n;
                        ((b$b)object2).n = n7 = androidx.constraintlayout.widget.b.n((TypedArray)context, n7, n8);
                        break;
                    }
                    case 34: {
                        n8 = ((b$b)object2).I;
                        ((b$b)object2).I = n7 = context.getDimensionPixelSize(n7, n8);
                        break;
                    }
                    case 33: {
                        n8 = ((b$b)object2).u;
                        ((b$b)object2).u = n7 = androidx.constraintlayout.widget.b.n((TypedArray)context, n7, n8);
                        break;
                    }
                    case 32: {
                        n8 = ((b$b)object2).t;
                        ((b$b)object2).t = n7 = androidx.constraintlayout.widget.b.n((TypedArray)context, n7, n8);
                        break;
                    }
                    case 31: {
                        n8 = ((b$b)object2).L;
                        ((b$b)object2).L = n7 = context.getDimensionPixelSize(n7, n8);
                        break;
                    }
                    case 30: {
                        n8 = ((b$b)object2).l;
                        ((b$b)object2).l = n7 = androidx.constraintlayout.widget.b.n((TypedArray)context, n7, n8);
                        break;
                    }
                    case 29: {
                        n8 = ((b$b)object2).k;
                        ((b$b)object2).k = n7 = androidx.constraintlayout.widget.b.n((TypedArray)context, n7, n8);
                        break;
                    }
                    case 28: {
                        n8 = ((b$b)object2).H;
                        ((b$b)object2).H = n7 = context.getDimensionPixelSize(n7, n8);
                        break;
                    }
                    case 27: {
                        n8 = ((b$b)object2).F;
                        ((b$b)object2).F = n7 = context.getInt(n7, n8);
                        break;
                    }
                    case 26: {
                        n8 = ((b$b)object2).j;
                        ((b$b)object2).j = n7 = androidx.constraintlayout.widget.b.n((TypedArray)context, n7, n8);
                        break;
                    }
                    case 25: {
                        n8 = ((b$b)object2).i;
                        ((b$b)object2).i = n7 = androidx.constraintlayout.widget.b.n((TypedArray)context, n7, n8);
                        break;
                    }
                    case 24: {
                        n8 = ((b$b)object2).G;
                        ((b$b)object2).G = n7 = context.getDimensionPixelSize(n7, n8);
                        break;
                    }
                    case 23: {
                        n8 = ((b$b)object2).c;
                        ((b$b)object2).c = n7 = context.getLayoutDimension(n7, n8);
                        break;
                    }
                    case 22: {
                        Object object3 = b$d.b;
                        b$d.b = object3 = context.getInt(n7, object3);
                        Object object5 = h;
                        b$d.b = object3 = (Object)object5[object3];
                        break;
                    }
                    case 21: {
                        n8 = ((b$b)object2).d;
                        ((b$b)object2).d = n7 = context.getLayoutDimension(n7, n8);
                        break;
                    }
                    case 20: {
                        float f8;
                        float f6 = ((b$b)object2).x;
                        ((b$b)object2).x = f8 = context.getFloat(n7, f6);
                        break;
                    }
                    case 19: {
                        float f8;
                        float f6 = ((b$b)object2).g;
                        ((b$b)object2).g = f8 = context.getFloat(n7, f6);
                        break;
                    }
                    case 18: {
                        n8 = ((b$b)object2).f;
                        ((b$b)object2).f = n7 = context.getDimensionPixelOffset(n7, n8);
                        break;
                    }
                    case 17: {
                        n8 = ((b$b)object2).e;
                        ((b$b)object2).e = n7 = context.getDimensionPixelOffset(n7, n8);
                        break;
                    }
                    case 16: {
                        n8 = ((b$b)object2).O;
                        ((b$b)object2).O = n7 = context.getDimensionPixelSize(n7, n8);
                        break;
                    }
                    case 15: {
                        n8 = ((b$b)object2).S;
                        ((b$b)object2).S = n7 = context.getDimensionPixelSize(n7, n8);
                        break;
                    }
                    case 14: {
                        n8 = ((b$b)object2).P;
                        ((b$b)object2).P = n7 = context.getDimensionPixelSize(n7, n8);
                        break;
                    }
                    case 13: {
                        n8 = ((b$b)object2).N;
                        ((b$b)object2).N = n7 = context.getDimensionPixelSize(n7, n8);
                        break;
                    }
                    case 12: {
                        n8 = ((b$b)object2).R;
                        ((b$b)object2).R = n7 = context.getDimensionPixelSize(n7, n8);
                        break;
                    }
                    case 11: {
                        n8 = ((b$b)object2).Q;
                        ((b$b)object2).Q = n7 = context.getDimensionPixelSize(n7, n8);
                        break;
                    }
                    case 10: {
                        n8 = ((b$b)object2).v;
                        ((b$b)object2).v = n7 = androidx.constraintlayout.widget.b.n((TypedArray)context, n7, n8);
                        break;
                    }
                    case 9: {
                        n8 = ((b$b)object2).w;
                        ((b$b)object2).w = n7 = androidx.constraintlayout.widget.b.n((TypedArray)context, n7, n8);
                        break;
                    }
                    case 8: {
                        n8 = ((b$b)object2).K;
                        ((b$b)object2).K = n7 = context.getDimensionPixelSize(n7, n8);
                        break;
                    }
                    case 7: {
                        n8 = ((b$b)object2).E;
                        ((b$b)object2).E = n7 = context.getDimensionPixelOffset(n7, n8);
                        break;
                    }
                    case 6: {
                        n8 = ((b$b)object2).D;
                        ((b$b)object2).D = n7 = context.getDimensionPixelOffset(n7, n8);
                        break;
                    }
                    case 5: {
                        Object object5 = context.getString(n7);
                        ((b$b)object2).z = object5;
                        break;
                    }
                    case 4: {
                        n8 = ((b$b)object2).o;
                        ((b$b)object2).o = n7 = androidx.constraintlayout.widget.b.n((TypedArray)context, n7, n8);
                        break;
                    }
                    case 3: {
                        n8 = ((b$b)object2).p;
                        ((b$b)object2).p = n7 = androidx.constraintlayout.widget.b.n((TypedArray)context, n7, n8);
                        break;
                    }
                    case 2: {
                        n8 = ((b$b)object2).J;
                        ((b$b)object2).J = n7 = context.getDimensionPixelSize(n7, n8);
                        break;
                    }
                    case 1: {
                        n8 = ((b$b)object2).q;
                        ((b$b)object2).q = n7 = androidx.constraintlayout.widget.b.n((TypedArray)context, n7, n8);
                    }
                    case 71: 
                }
                ++n4;
            }
            object = ((b$b)object2).k0;
            if (object != null) {
                n3 = 0;
                object = null;
                ((b$b)object2).j0 = null;
            }
        }
        context.recycle();
        return b$a;
    }

    public static int n(TypedArray typedArray, int n3, int n4) {
        int n7;
        if ((n4 = typedArray.getResourceId(n3, n4)) == (n7 = -1)) {
            n4 = typedArray.getInt(n3, n7);
        }
        return n4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void o(Object object, TypedArray object2, int n3, int n4) {
        float f5;
        int n7;
        int n8;
        int n10;
        int n14;
        int n15;
        Object object3;
        block32: {
            int n16;
            int n17;
            block37: {
                block35: {
                    block36: {
                        block33: {
                            block34: {
                                if (object == null) {
                                    return;
                                }
                                object3 = object2.peekValue(n3);
                                n15 = ((TypedValue)object3).type;
                                int n18 = 3;
                                n14 = 23;
                                n10 = 21;
                                n8 = 1;
                                n7 = 5;
                                n17 = 0;
                                if (n15 == n18) break block32;
                                if (n15 == n7) break block33;
                                n16 = object2.getInt(n3, 0);
                                n3 = -4;
                                float f6 = 0.0f / 0.0f;
                                n15 = -2;
                                if (n16 == n3) break block34;
                                n3 = -3;
                                f6 = 0.0f / 0.0f;
                                if (n16 == n3) break block35;
                                if (n16 == n15) break block36;
                                n3 = -1;
                                f6 = 0.0f / 0.0f;
                                if (n16 == n3) break block36;
                                break block35;
                            }
                            n17 = -2;
                            break block37;
                        }
                        n16 = object2.getDimensionPixelSize(n3, 0);
                    }
                    n17 = n16;
                }
                n8 = 0;
            }
            n16 = object instanceof ConstraintLayout$LayoutParams;
            if (n16 != 0) {
                object = (ConstraintLayout$LayoutParams)((Object)object);
                if (n4 == 0) {
                    ((ViewGroup.MarginLayoutParams)object).width = n17;
                    ((ConstraintLayout$LayoutParams)((Object)object)).W = n8;
                    return;
                }
                ((ViewGroup.MarginLayoutParams)object).height = n17;
                ((ConstraintLayout$LayoutParams)((Object)object)).X = n8;
                return;
            }
            n16 = object instanceof b$b;
            if (n16 != 0) {
                object = (b$b)object;
                if (n4 == 0) {
                    ((b$b)object).c = n17;
                    ((b$b)object).m0 = n8;
                    return;
                }
                ((b$b)object).d = n17;
                ((b$b)object).n0 = n8;
                return;
            }
            n16 = object instanceof b$a$a;
            if (n16 == 0) return;
            object = (b$a$a)object;
            if (n4 == 0) {
                ((b$a$a)object).b(n14, n17);
                n16 = 80;
                float f7 = 1.12E-43f;
                ((b$a$a)object).d(n16, n8 != 0);
                return;
            }
            ((b$a$a)object).b(n10, n17);
            n16 = 81;
            float f8 = 1.14E-43f;
            ((b$a$a)object).d(n16, n8 != 0);
            return;
        }
        if ((object2 = object2.getString(n3)) == null) {
            return;
        }
        float f11 = 8.5E-44f;
        n3 = ((String)object2).indexOf(61);
        n15 = ((String)object2).length();
        if (n3 <= 0) return;
        if (n3 >= (n15 -= n8)) return;
        object3 = ((String)object2).substring(0, n3);
        n3 += n8;
        if ((n3 = ((String)(object2 = ((String)object2).substring(n3))).length()) <= 0) return;
        String string2 = ((String)object3).trim();
        object2 = ((String)object2).trim();
        object3 = "ratio";
        n15 = (int)(((String)object3).equalsIgnoreCase(string2) ? 1 : 0);
        if (n15 != 0) {
            n3 = object instanceof ConstraintLayout$LayoutParams;
            if (n3 != 0) {
                object = (ConstraintLayout$LayoutParams)((Object)object);
                if (n4 == 0) {
                    ((ViewGroup.MarginLayoutParams)object).width = 0;
                } else {
                    ((ViewGroup.MarginLayoutParams)object).height = 0;
                }
                androidx.constraintlayout.widget.b.p((ConstraintLayout$LayoutParams)((Object)object), (String)object2);
                return;
            }
            n3 = object instanceof b$b;
            if (n3 != 0) {
                object = (b$b)object;
                ((b$b)object).z = object2;
                return;
            }
            n3 = object instanceof b$a$a;
            if (n3 == 0) return;
            object = (b$a$a)object;
            ((b$a$a)object).c(n7, (String)object2);
            return;
        }
        object3 = "weight";
        n15 = (int)(((String)object3).equalsIgnoreCase(string2) ? 1 : 0);
        if (n15 != 0) {
            float f12 = Float.parseFloat((String)object2);
            n3 = object instanceof ConstraintLayout$LayoutParams;
            if (n3 != 0) {
                object = (ConstraintLayout$LayoutParams)((Object)object);
                if (n4 == 0) {
                    ((ViewGroup.MarginLayoutParams)object).width = 0;
                    ((ConstraintLayout$LayoutParams)((Object)object)).H = f12;
                    return;
                }
                ((ViewGroup.MarginLayoutParams)object).height = 0;
                ((ConstraintLayout$LayoutParams)((Object)object)).I = f12;
                return;
            }
            n3 = object instanceof b$b;
            if (n3 != 0) {
                object = (b$b)object;
                if (n4 == 0) {
                    ((b$b)object).c = 0;
                    ((b$b)object).V = f12;
                    return;
                }
                ((b$b)object).d = 0;
                ((b$b)object).U = f12;
                return;
            }
            n3 = object instanceof b$a$a;
            if (n3 == 0) return;
            object = (b$a$a)object;
            if (n4 == 0) {
                ((b$a$a)object).b(n14, 0);
                n3 = 39;
                f11 = 5.5E-44f;
                ((b$a$a)object).a(f12, n3);
                return;
            }
            ((b$a$a)object).b(n10, 0);
            n3 = 40;
            f11 = 5.6E-44f;
            ((b$a$a)object).a(f12, n3);
            return;
        }
        object3 = "parent";
        n3 = (int)(((String)object3).equalsIgnoreCase(string2) ? 1 : 0);
        if (n3 == 0) return;
        try {
            f5 = Float.parseFloat((String)object2);
            n3 = 1065353216;
            f11 = 1.0f;
            f5 = Math.min(f11, f5);
            n3 = 0;
            f11 = 0.0f;
            string2 = null;
            f5 = Math.max(0.0f, f5);
        }
        catch (NumberFormatException numberFormatException) {
            return;
        }
        n3 = object instanceof ConstraintLayout$LayoutParams;
        n15 = 2;
        if (n3 != 0) {
            object = (ConstraintLayout$LayoutParams)((Object)object);
            if (n4 == 0) {
                ((ViewGroup.MarginLayoutParams)object).width = 0;
                ((ConstraintLayout$LayoutParams)((Object)object)).R = f5;
                ((ConstraintLayout$LayoutParams)((Object)object)).L = n15;
                return;
            }
            ((ViewGroup.MarginLayoutParams)object).height = 0;
            ((ConstraintLayout$LayoutParams)((Object)object)).S = f5;
            ((ConstraintLayout$LayoutParams)((Object)object)).M = n15;
            return;
        }
        n3 = object instanceof b$b;
        if (n3 != 0) {
            object = (b$b)object;
            if (n4 == 0) {
                ((b$b)object).c = 0;
                ((b$b)object).e0 = f5;
                ((b$b)object).Y = n15;
                return;
            }
            ((b$b)object).d = 0;
            ((b$b)object).f0 = f5;
            ((b$b)object).Z = n15;
            return;
        }
        int n19 = object instanceof b$a$a;
        if (n19 == 0) return;
        object = (b$a$a)object;
        if (n4 == 0) {
            ((b$a$a)object).b(n14, 0);
            n19 = 54;
            f5 = 7.6E-44f;
            ((b$a$a)object).b(n19, n15);
            return;
        }
        ((b$a$a)object).b(n10, 0);
        n19 = 55;
        f5 = 7.7E-44f;
        ((b$a$a)object).b(n19, n15);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void p(ConstraintLayout$LayoutParams constraintLayout$LayoutParams, String string2) {
        block10: {
            int n3;
            int n4;
            block11: {
                float f5;
                float f6;
                int n7;
                if (string2 == null) break block10;
                int n8 = string2.length();
                float f7 = 6.2E-44f;
                n4 = string2.indexOf(44);
                int n10 = 1;
                int n14 = -1;
                n3 = 0;
                String string3 = null;
                if (n4 > 0 && n4 < (n7 = n8 + -1)) {
                    String string4;
                    String string5 = string2.substring(0, n4);
                    boolean bl2 = string5.equalsIgnoreCase(string4 = "W");
                    if (bl2) {
                        n14 = 0;
                    } else {
                        string3 = "H";
                        n3 = (int)(string5.equalsIgnoreCase(string3) ? 1 : 0);
                        if (n3 != 0) {
                            n14 = 1;
                        }
                    }
                    n3 = n4 + 1;
                }
                f7 = 8.1E-44f;
                n4 = string2.indexOf(58);
                if (n4 < 0 || n4 >= (n8 -= n10)) break block11;
                String string6 = string2.substring(n3, n4);
                String string7 = string2.substring(n4 += n10);
                n3 = string6.length();
                if (n3 <= 0 || (n3 = string7.length()) <= 0) break block10;
                try {
                    f6 = Float.parseFloat(string6);
                    f7 = Float.parseFloat(string7);
                    n3 = 0;
                    string3 = null;
                }
                catch (NumberFormatException numberFormatException) {}
                float f8 = f6 - 0.0f;
                n7 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
                if (n7 <= 0 || (n3 = (int)((f5 = f7 - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1))) <= 0) break block10;
                if (n14 == n10) {
                    f7 /= f6;
                    Math.abs(f7);
                    break block10;
                }
                f6 /= f7;
                Math.abs(f6);
                break block10;
            }
            String string8 = string2.substring(n3);
            n4 = string8.length();
            if (n4 <= 0) break block10;
            Float.parseFloat(string8);
        }
        constraintLayout$LayoutParams.G = string2;
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    public static void q(b$a b$a, TypedArray typedArray) {
        b$a$a b$a$a;
        b$a b$a2 = b$a;
        TypedArray typedArray2 = typedArray;
        int n3 = typedArray.getIndexCount();
        b$a.h = b$a$a = new b$a$a();
        b$c b$c = b$a.d;
        int n4 = 0;
        float f5 = 0.0f;
        Object var9_9 = null;
        b$c.a = false;
        b$b b$b = b$a.e;
        b$b.b = false;
        b$d b$d = b$a.c;
        b$d.a = false;
        b$e b$e = b$a.f;
        b$e.a = false;
        int n7 = 0;
        while (n7 < n3) {
            int n8 = typedArray2.getIndex(n7);
            Object object = j;
            int n10 = object.get(n8);
            SparseIntArray sparseIntArray = i;
            int n14 = 1;
            int n15 = 3;
            int n16 = -1;
            int n17 = 0;
            block83: do {
                switch (n17 == 0 ? n10 : n17) {
                    default: {
                        Integer.toHexString(n8);
                        sparseIntArray.get(n8);
                        n17 = 71;
                        continue block83;
                    }
                    case 99: {
                        n10 = (int)(b$b.h ? 1 : 0);
                        n8 = (int)(typedArray2.getBoolean(n8, n10 != 0) ? 1 : 0);
                        n10 = 99;
                        float f6 = 1.39E-43f;
                        b$a$a.d(n10, n8 != 0);
                        n17 = 71;
                        continue block83;
                    }
                    case 98: {
                        String string2;
                        n10 = (int)(MotionLayout.H0 ? 1 : 0);
                        if (n10 != 0) {
                            n10 = b$a2.a;
                            b$a2.a = n10 = typedArray2.getResourceId(n8, n10);
                            n17 = 71;
                            if (n10 != n16) continue block83;
                            b$a2.b = string2 = typedArray2.getString(n8);
                            n17 = 71;
                            continue block83;
                        }
                        object = typedArray2.peekValue(n8);
                        n10 = ((TypedValue)object).type;
                        if (n10 == n15) {
                            b$a2.b = string2 = typedArray2.getString(n8);
                            n17 = 71;
                            continue block83;
                        }
                        n10 = b$a2.a;
                        b$a2.a = n8 = typedArray2.getResourceId(n8, n10);
                        n17 = 71;
                        continue block83;
                    }
                    case 97: {
                        n10 = b$b.p0;
                        n8 = typedArray2.getInt(n8, n10);
                        n10 = 97;
                        float f6 = 1.36E-43f;
                        b$a$a.b(n10, n8);
                        n17 = 71;
                        continue block83;
                    }
                    case 96: {
                        androidx.constraintlayout.widget.b.o(b$a$a, typedArray2, n8, n14);
                        n17 = 71;
                        continue block83;
                    }
                    case 95: {
                        androidx.constraintlayout.widget.b.o(b$a$a, typedArray2, n8, 0);
                        n17 = 71;
                        continue block83;
                    }
                    case 94: {
                        n10 = b$b.T;
                        n8 = typedArray2.getDimensionPixelSize(n8, n10);
                        n10 = 94;
                        float f6 = 1.32E-43f;
                        b$a$a.b(n10, n8);
                        n17 = 71;
                        continue block83;
                    }
                    case 93: {
                        n10 = b$b.M;
                        n8 = typedArray2.getDimensionPixelSize(n8, n10);
                        n10 = 93;
                        float f6 = 1.3E-43f;
                        b$a$a.b(n10, n8);
                        n17 = 71;
                        continue block83;
                    }
                    case 87: {
                        Integer.toHexString(n8);
                        sparseIntArray.get(n8);
                        n17 = 71;
                        continue block83;
                    }
                    case 86: {
                        object = typedArray2.peekValue(n8);
                        n10 = ((TypedValue)object).type;
                        int n18 = -2;
                        float f7 = 0.0f / 0.0f;
                        n4 = 89;
                        f5 = 1.25E-43f;
                        n15 = 88;
                        if (n10 == n14) {
                            b$c.m = n8 = typedArray2.getResourceId(n8, n16);
                            b$a$a.b(n4, n8);
                            n17 = 71;
                            n4 = b$c.m;
                            if (n4 == n16) continue block83;
                            b$c.l = n18;
                            b$a$a.b(n15, n18);
                            n17 = 71;
                            continue block83;
                        }
                        n14 = 3;
                        if (n10 == n14) {
                            object = typedArray2.getString(n8);
                            b$c.k = object;
                            n14 = 90;
                            b$a$a.c(n14, (String)object);
                            object = b$c.k;
                            String string3 = "/";
                            n10 = ((String)object).indexOf(string3);
                            if (n10 > 0) {
                                b$c.m = n8 = typedArray2.getResourceId(n8, n16);
                                b$a$a.b(n4, n8);
                                b$c.l = n18;
                                b$a$a.b(n15, n18);
                                n17 = 71;
                                continue block83;
                            }
                            b$c.l = n16;
                            b$a$a.b(n15, n16);
                            n17 = 71;
                            continue block83;
                        }
                        n4 = b$c.m;
                        b$c.l = n4 = typedArray2.getInteger(n8, n4);
                        b$a$a.b(n15, n4);
                        n17 = 71;
                        continue block83;
                    }
                    case 85: {
                        f5 = b$c.i;
                        f5 = typedArray2.getFloat(n8, f5);
                        n8 = 85;
                        float f8 = 1.19E-43f;
                        b$a$a.a(f5, n8);
                        n17 = 71;
                        continue block83;
                    }
                    case 84: {
                        n4 = b$c.j;
                        n4 = typedArray2.getInteger(n8, n4);
                        n8 = 84;
                        float f8 = 1.18E-43f;
                        b$a$a.b(n8, n4);
                        n17 = 71;
                        continue block83;
                    }
                    case 83: {
                        n4 = b$e.i;
                        n4 = androidx.constraintlayout.widget.b.n(typedArray2, n8, n4);
                        n8 = 83;
                        float f8 = 1.16E-43f;
                        b$a$a.b(n8, n4);
                        n17 = 71;
                        continue block83;
                    }
                    case 82: {
                        n4 = b$c.c;
                        n4 = typedArray2.getInteger(n8, n4);
                        n8 = 82;
                        float f8 = 1.15E-43f;
                        b$a$a.b(n8, n4);
                        n17 = 71;
                        continue block83;
                    }
                    case 81: {
                        n4 = (int)(b$b.n0 ? 1 : 0);
                        n4 = (int)(typedArray2.getBoolean(n8, n4 != 0) ? 1 : 0);
                        n8 = 81;
                        float f8 = 1.14E-43f;
                        b$a$a.d(n8, n4 != 0);
                        n17 = 71;
                        continue block83;
                    }
                    case 80: {
                        n4 = (int)(b$b.m0 ? 1 : 0);
                        n4 = (int)(typedArray2.getBoolean(n8, n4 != 0) ? 1 : 0);
                        n8 = 80;
                        float f8 = 1.12E-43f;
                        b$a$a.d(n8, n4 != 0);
                        n17 = 71;
                        continue block83;
                    }
                    case 79: {
                        f5 = b$c.g;
                        f5 = typedArray2.getFloat(n8, f5);
                        n8 = 79;
                        float f8 = 1.11E-43f;
                        b$a$a.a(f5, n8);
                        n17 = 71;
                        continue block83;
                    }
                    case 78: {
                        n4 = b$d.c;
                        n4 = typedArray2.getInt(n8, n4);
                        n8 = 78;
                        float f8 = 1.1E-43f;
                        b$a$a.b(n8, n4);
                        n17 = 71;
                        continue block83;
                    }
                    case 77: {
                        n4 = 77;
                        f5 = 1.08E-43f;
                        String string2 = typedArray2.getString(n8);
                        b$a$a.c(n4, string2);
                        n17 = 71;
                        continue block83;
                    }
                    case 76: {
                        n4 = b$c.e;
                        n4 = typedArray2.getInt(n8, n4);
                        n8 = 76;
                        float f8 = 1.06E-43f;
                        b$a$a.b(n8, n4);
                        n17 = 71;
                        continue block83;
                    }
                    case 75: {
                        n4 = (int)(b$b.o0 ? 1 : 0);
                        n4 = (int)(typedArray2.getBoolean(n8, n4 != 0) ? 1 : 0);
                        n8 = 75;
                        float f8 = 1.05E-43f;
                        b$a$a.d(n8, n4 != 0);
                        n17 = 71;
                        continue block83;
                    }
                    case 74: {
                        n4 = 74;
                        f5 = 1.04E-43f;
                        String string2 = typedArray2.getString(n8);
                        b$a$a.c(n4, string2);
                        n17 = 71;
                        continue block83;
                    }
                    case 73: {
                        n4 = b$b.h0;
                        n4 = typedArray2.getDimensionPixelSize(n8, n4);
                        n8 = 73;
                        float f8 = 1.02E-43f;
                        b$a$a.b(n8, n4);
                        n17 = 71;
                        continue block83;
                    }
                    case 72: {
                        n4 = b$b.g0;
                        n4 = typedArray2.getInt(n8, n4);
                        n8 = 72;
                        float f8 = 1.01E-43f;
                        b$a$a.b(n8, n4);
                        n17 = 71;
                        continue block83;
                    }
                    case 70: {
                        n4 = 70;
                        f5 = 9.8E-44f;
                        n10 = 1065353216;
                        float f6 = 1.0f;
                        float f8 = typedArray2.getFloat(n8, f6);
                        b$a$a.a(f8, n4);
                        n17 = 71;
                        continue block83;
                    }
                    case 69: {
                        n10 = 1065353216;
                        float f6 = 1.0f;
                        n4 = 69;
                        f5 = 9.7E-44f;
                        float f8 = typedArray2.getFloat(n8, f6);
                        b$a$a.a(f8, n4);
                        n17 = 71;
                        continue block83;
                    }
                    case 68: {
                        f5 = b$d.e;
                        f5 = typedArray2.getFloat(n8, f5);
                        n8 = 68;
                        float f8 = 9.5E-44f;
                        b$a$a.a(f5, n8);
                        n17 = 71;
                        continue block83;
                    }
                    case 67: {
                        f5 = b$c.h;
                        f5 = typedArray2.getFloat(n8, f5);
                        n8 = 67;
                        float f8 = 9.4E-44f;
                        b$a$a.a(f5, n8);
                    }
                    case 71: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        break;
                    }
                    case 66: {
                        n4 = 66;
                        f5 = 9.2E-44f;
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n8 = typedArray2.getInt(n8, 0);
                        b$a$a.b(n4, n8);
                        break;
                    }
                    case 65: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        TypedValue typedValue = typedArray2.peekValue(n8);
                        n4 = typedValue.type;
                        int n18 = 65;
                        float f7 = 9.1E-44f;
                        n14 = 3;
                        if (n4 == n14) {
                            String string4 = typedArray2.getString(n8);
                            b$a$a.c(n18, string4);
                            break;
                        }
                        String[] stringArray = bx0_0.c;
                        n8 = typedArray2.getInteger(n8, 0);
                        String string5 = stringArray[n8];
                        b$a$a.c(n18, string5);
                        break;
                    }
                    case 64: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = b$c.b;
                        n4 = androidx.constraintlayout.widget.b.n(typedArray2, n8, n4);
                        n8 = 64;
                        float f8 = 9.0E-44f;
                        b$a$a.b(n8, n4);
                        break;
                    }
                    case 63: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        f5 = b$b.C;
                        f5 = typedArray2.getFloat(n8, f5);
                        n8 = 63;
                        float f8 = 8.8E-44f;
                        b$a$a.a(f5, n8);
                        break;
                    }
                    case 62: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = b$b.B;
                        n4 = typedArray2.getDimensionPixelSize(n8, n4);
                        n8 = 62;
                        float f8 = 8.7E-44f;
                        b$a$a.b(n8, n4);
                        break;
                    }
                    case 60: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        f5 = b$e.b;
                        f5 = typedArray2.getFloat(n8, f5);
                        n8 = 60;
                        float f8 = 8.4E-44f;
                        b$a$a.a(f5, n8);
                        break;
                    }
                    case 59: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = b$b.d0;
                        n4 = typedArray2.getDimensionPixelSize(n8, n4);
                        n8 = 59;
                        float f8 = 8.3E-44f;
                        b$a$a.b(n8, n4);
                        break;
                    }
                    case 58: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = b$b.c0;
                        n4 = typedArray2.getDimensionPixelSize(n8, n4);
                        n8 = 58;
                        float f8 = 8.1E-44f;
                        b$a$a.b(n8, n4);
                        break;
                    }
                    case 57: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = b$b.b0;
                        n4 = typedArray2.getDimensionPixelSize(n8, n4);
                        n8 = 57;
                        float f8 = 8.0E-44f;
                        b$a$a.b(n8, n4);
                        break;
                    }
                    case 56: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = b$b.a0;
                        n4 = typedArray2.getDimensionPixelSize(n8, n4);
                        n8 = 56;
                        float f8 = 7.8E-44f;
                        b$a$a.b(n8, n4);
                        break;
                    }
                    case 55: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = b$b.Z;
                        n4 = typedArray2.getInt(n8, n4);
                        n8 = 55;
                        float f8 = 7.7E-44f;
                        b$a$a.b(n8, n4);
                        break;
                    }
                    case 54: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = b$b.Y;
                        n4 = typedArray2.getInt(n8, n4);
                        n8 = 54;
                        float f8 = 7.6E-44f;
                        b$a$a.b(n8, n4);
                        break;
                    }
                    case 53: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        f5 = b$e.l;
                        f5 = typedArray2.getDimension(n8, f5);
                        n8 = 53;
                        float f8 = 7.4E-44f;
                        b$a$a.a(f5, n8);
                        break;
                    }
                    case 52: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        f5 = b$e.k;
                        f5 = typedArray2.getDimension(n8, f5);
                        n8 = 52;
                        float f8 = 7.3E-44f;
                        b$a$a.a(f5, n8);
                        break;
                    }
                    case 51: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        f5 = b$e.j;
                        f5 = typedArray2.getDimension(n8, f5);
                        n8 = 51;
                        float f8 = 7.1E-44f;
                        b$a$a.a(f5, n8);
                        break;
                    }
                    case 50: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        f5 = b$e.h;
                        f5 = typedArray2.getDimension(n8, f5);
                        n8 = 50;
                        float f8 = 7.0E-44f;
                        b$a$a.a(f5, n8);
                        break;
                    }
                    case 49: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        f5 = b$e.g;
                        f5 = typedArray2.getDimension(n8, f5);
                        n8 = 49;
                        float f8 = 6.9E-44f;
                        b$a$a.a(f5, n8);
                        break;
                    }
                    case 48: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        f5 = b$e.f;
                        f5 = typedArray2.getFloat(n8, f5);
                        n8 = 48;
                        float f8 = 6.7E-44f;
                        b$a$a.a(f5, n8);
                        break;
                    }
                    case 47: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        f5 = b$e.e;
                        f5 = typedArray2.getFloat(n8, f5);
                        n8 = 47;
                        float f8 = 6.6E-44f;
                        b$a$a.a(f5, n8);
                        break;
                    }
                    case 46: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        f5 = b$e.d;
                        f5 = typedArray2.getFloat(n8, f5);
                        n8 = 46;
                        float f8 = 6.4E-44f;
                        b$a$a.a(f5, n8);
                        break;
                    }
                    case 45: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        f5 = b$e.c;
                        f5 = typedArray2.getFloat(n8, f5);
                        n8 = 45;
                        float f8 = 6.3E-44f;
                        b$a$a.a(f5, n8);
                        break;
                    }
                    case 44: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = 44;
                        f5 = 6.2E-44f;
                        b$a$a.d(n4, n14 != 0);
                        float f7 = b$e.n;
                        float f8 = typedArray2.getDimension(n8, f7);
                        b$a$a.a(f8, n4);
                        break;
                    }
                    case 43: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        f5 = b$d.d;
                        f5 = typedArray2.getFloat(n8, f5);
                        n8 = 43;
                        float f8 = 6.0E-44f;
                        b$a$a.a(f5, n8);
                        break;
                    }
                    case 42: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = b$b.X;
                        n4 = typedArray2.getInt(n8, n4);
                        n8 = 42;
                        float f8 = 5.9E-44f;
                        b$a$a.b(n8, n4);
                        break;
                    }
                    case 41: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = b$b.W;
                        n4 = typedArray2.getInt(n8, n4);
                        n8 = 41;
                        float f8 = 5.7E-44f;
                        b$a$a.b(n8, n4);
                        break;
                    }
                    case 40: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        f5 = b$b.U;
                        f5 = typedArray2.getFloat(n8, f5);
                        n8 = 40;
                        float f8 = 5.6E-44f;
                        b$a$a.a(f5, n8);
                        break;
                    }
                    case 39: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        f5 = b$b.V;
                        f5 = typedArray2.getFloat(n8, f5);
                        n8 = 39;
                        float f8 = 5.5E-44f;
                        b$a$a.a(f5, n8);
                        break;
                    }
                    case 38: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = b$a2.a;
                        b$a2.a = n4 = typedArray2.getResourceId(n8, n4);
                        n8 = 38;
                        float f8 = 5.3E-44f;
                        b$a$a.b(n8, n4);
                        break;
                    }
                    case 37: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        f5 = b$b.y;
                        f5 = typedArray2.getFloat(n8, f5);
                        n8 = 37;
                        float f8 = 5.2E-44f;
                        b$a$a.a(f5, n8);
                        break;
                    }
                    case 34: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = b$b.I;
                        n4 = typedArray2.getDimensionPixelSize(n8, n4);
                        n8 = 34;
                        float f8 = 4.8E-44f;
                        b$a$a.b(n8, n4);
                        break;
                    }
                    case 31: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = b$b.L;
                        n4 = typedArray2.getDimensionPixelSize(n8, n4);
                        n8 = 31;
                        float f8 = 4.3E-44f;
                        b$a$a.b(n8, n4);
                        break;
                    }
                    case 28: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = b$b.H;
                        n4 = typedArray2.getDimensionPixelSize(n8, n4);
                        n8 = 28;
                        float f8 = 3.9E-44f;
                        b$a$a.b(n8, n4);
                        break;
                    }
                    case 27: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = b$b.F;
                        n4 = typedArray2.getInt(n8, n4);
                        n8 = 27;
                        float f8 = 3.8E-44f;
                        b$a$a.b(n8, n4);
                        break;
                    }
                    case 24: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = b$b.G;
                        n4 = typedArray2.getDimensionPixelSize(n8, n4);
                        n8 = 24;
                        float f8 = 3.4E-44f;
                        b$a$a.b(n8, n4);
                        break;
                    }
                    case 23: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = b$b.c;
                        n4 = typedArray2.getLayoutDimension(n8, n4);
                        n8 = 23;
                        float f8 = 3.2E-44f;
                        b$a$a.b(n8, n4);
                        break;
                    }
                    case 22: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        int[] nArray = h;
                        int n18 = b$d.b;
                        n8 = typedArray2.getInt(n8, n18);
                        n4 = nArray[n8];
                        n8 = 22;
                        float f8 = 3.1E-44f;
                        b$a$a.b(n8, n4);
                        break;
                    }
                    case 21: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = b$b.d;
                        n4 = typedArray2.getLayoutDimension(n8, n4);
                        n8 = 21;
                        float f8 = 2.9E-44f;
                        b$a$a.b(n8, n4);
                        break;
                    }
                    case 20: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        f5 = b$b.x;
                        f5 = typedArray2.getFloat(n8, f5);
                        n8 = 20;
                        float f8 = 2.8E-44f;
                        b$a$a.a(f5, n8);
                        break;
                    }
                    case 19: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        f5 = b$b.g;
                        f5 = typedArray2.getFloat(n8, f5);
                        n8 = 19;
                        float f8 = 2.7E-44f;
                        b$a$a.a(f5, n8);
                        break;
                    }
                    case 18: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = b$b.f;
                        n4 = typedArray2.getDimensionPixelOffset(n8, n4);
                        n8 = 18;
                        float f8 = 2.5E-44f;
                        b$a$a.b(n8, n4);
                        break;
                    }
                    case 17: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = b$b.e;
                        n4 = typedArray2.getDimensionPixelOffset(n8, n4);
                        n8 = 17;
                        float f8 = 2.4E-44f;
                        b$a$a.b(n8, n4);
                        break;
                    }
                    case 16: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = b$b.O;
                        n4 = typedArray2.getDimensionPixelSize(n8, n4);
                        n8 = 16;
                        float f8 = 2.2E-44f;
                        b$a$a.b(n8, n4);
                        break;
                    }
                    case 15: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = b$b.S;
                        n4 = typedArray2.getDimensionPixelSize(n8, n4);
                        n8 = 15;
                        float f8 = 2.1E-44f;
                        b$a$a.b(n8, n4);
                        break;
                    }
                    case 14: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = b$b.P;
                        n4 = typedArray2.getDimensionPixelSize(n8, n4);
                        n8 = 14;
                        float f8 = 2.0E-44f;
                        b$a$a.b(n8, n4);
                        break;
                    }
                    case 13: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = b$b.N;
                        n4 = typedArray2.getDimensionPixelSize(n8, n4);
                        n8 = 13;
                        float f8 = 1.8E-44f;
                        b$a$a.b(n8, n4);
                        break;
                    }
                    case 12: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = b$b.R;
                        n4 = typedArray2.getDimensionPixelSize(n8, n4);
                        n8 = 12;
                        float f8 = 1.7E-44f;
                        b$a$a.b(n8, n4);
                        break;
                    }
                    case 11: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = b$b.Q;
                        n4 = typedArray2.getDimensionPixelSize(n8, n4);
                        n8 = 11;
                        float f8 = 1.5E-44f;
                        b$a$a.b(n8, n4);
                        break;
                    }
                    case 8: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = b$b.K;
                        n4 = typedArray2.getDimensionPixelSize(n8, n4);
                        n8 = 8;
                        float f8 = 1.1E-44f;
                        b$a$a.b(n8, n4);
                        break;
                    }
                    case 7: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = b$b.E;
                        n4 = typedArray2.getDimensionPixelOffset(n8, n4);
                        n8 = 7;
                        float f8 = 9.8E-45f;
                        b$a$a.b(n8, n4);
                        break;
                    }
                    case 6: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = b$b.D;
                        n4 = typedArray2.getDimensionPixelOffset(n8, n4);
                        n8 = 6;
                        float f8 = 8.4E-45f;
                        b$a$a.b(n8, n4);
                        break;
                    }
                    case 5: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = 5;
                        f5 = 7.0E-45f;
                        String string2 = typedArray2.getString(n8);
                        b$a$a.c(n4, string2);
                        break;
                    }
                    case 2: {
                        n10 = 0;
                        float f6 = 0.0f;
                        object = null;
                        n4 = b$b.J;
                        n4 = typedArray2.getDimensionPixelSize(n8, n4);
                        n8 = 2;
                        float f8 = 2.8E-45f;
                        b$a$a.b(n8, n4);
                    }
                }
                break;
            } while (true);
            ++n7;
            n4 = 0;
            f5 = 0.0f;
            Object var9_17 = null;
        }
        return;
    }

    public static String r(int n3) {
        switch (n3) {
            default: {
                return "undefined";
            }
            case 7: {
                return "end";
            }
            case 6: {
                return "start";
            }
            case 5: {
                return "baseline";
            }
            case 4: {
                return "bottom";
            }
            case 3: {
                return "top";
            }
            case 2: {
                return "right";
            }
            case 1: 
        }
        return "left";
    }

    public final void a(ConstraintLayout object) {
        int n3 = object.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            HashMap hashMap = this.g;
            View view = object.getChildAt(i3);
            int n4 = view.getId();
            Integer n7 = n4;
            int n8 = hashMap.containsKey(n7);
            if (n8 == 0) {
                oi0_0.d(view);
                continue;
            }
            n8 = this.f;
            if (n8 != 0 && n4 == (n8 = -1)) {
                object = new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                throw object;
            }
            n7 = n4;
            n8 = (int)(hashMap.containsKey(n7) ? 1 : 0);
            if (n8 == 0) continue;
            Object object2 = n4;
            if ((object2 = (b$a)hashMap.get(object2)) == null) continue;
            object2 = ((b$a)object2).g;
            androidx.constraintlayout.widget.a.e(view, (HashMap)object2);
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        this.c(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void c(ConstraintLayout object) {
        Object object2;
        int n3;
        int n4;
        Object object3;
        int n7;
        Object object4;
        int n8;
        int n10 = object.getChildCount();
        HashMap hashMap = this.g;
        Set set = hashMap.keySet();
        Object object5 = new HashSet(set);
        int n14 = 0;
        set = null;
        int n15 = 0;
        Object object6 = null;
        while (true) {
            n8 = 1;
            float f5 = Float.MIN_VALUE;
            if (n15 >= n10) break;
            object4 = object.getChildAt(n15);
            n7 = object4.getId();
            object3 = n7;
            n4 = hashMap.containsKey(object3);
            if (n4 == 0) {
                oi0_0.d((View)object4);
            } else {
                n4 = this.f;
                n3 = -1;
                float f6 = 0.0f / 0.0f;
                if (n4 != 0 && n7 == n3) {
                    object = new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                    throw object;
                }
                if (n7 != n3 && (n4 = (int)(hashMap.containsKey(object3 = Integer.valueOf(n7)) ? 1 : 0)) != 0) {
                    object3 = n7;
                    ((HashSet)object5).remove(object3);
                    object3 = n7;
                    object3 = (b$a)hashMap.get(object3);
                    if (object3 != null) {
                        Object object7;
                        int n16 = object4 instanceof Barrier;
                        if (n16 != 0) {
                            b$b b$b = ((b$a)object3).e;
                            b$b.i0 = n8;
                            object7 = object4;
                            object7 = (Barrier)((Object)object4);
                            object7.setId(n7);
                            n7 = b$b.g0;
                            ((Barrier)((Object)object7)).setType(n7);
                            n7 = b$b.h0;
                            ((Barrier)((Object)object7)).setMargin(n7);
                            n7 = (int)(b$b.o0 ? 1 : 0);
                            ((Barrier)((Object)object7)).setAllowsGoneWidget(n7 != 0);
                            object2 = b$b.j0;
                            if (object2 != null) {
                                ((ConstraintHelper)((Object)object7)).setReferencedIds((int[])object2);
                            } else {
                                object2 = b$b.k0;
                                if (object2 != null) {
                                    object2 = androidx.constraintlayout.widget.b.h((Barrier)((Object)object7), (String)object2);
                                    b$b.j0 = (int[])object2;
                                    ((ConstraintHelper)((Object)object7)).setReferencedIds((int[])object2);
                                }
                            }
                        }
                        object7 = (ConstraintLayout$LayoutParams)((View)object4).getLayoutParams();
                        ((ConstraintLayout$LayoutParams)((Object)object7)).a();
                        ((b$a)object3).a((ConstraintLayout$LayoutParams)((Object)object7));
                        object2 = ((b$a)object3).g;
                        androidx.constraintlayout.widget.a.e((View)object4, (HashMap)object2);
                        ((View)object4).setLayoutParams((ViewGroup.LayoutParams)object7);
                        object7 = ((b$a)object3).c;
                        n7 = ((b$d)object7).c;
                        if (n7 == 0) {
                            n7 = ((b$d)object7).b;
                            ((View)object4).setVisibility(n7);
                        }
                        f5 = ((b$d)object7).d;
                        ((View)object4).setAlpha(f5);
                        object7 = ((b$a)object3).f;
                        float f7 = ((b$e)object7).b;
                        ((View)object4).setRotation(f7);
                        f7 = ((b$e)object7).c;
                        ((View)object4).setRotationX(f7);
                        f7 = ((b$e)object7).d;
                        ((View)object4).setRotationY(f7);
                        f7 = ((b$e)object7).e;
                        ((View)object4).setScaleX(f7);
                        f7 = ((b$e)object7).f;
                        ((View)object4).setScaleY(f7);
                        n7 = ((b$e)object7).i;
                        if (n7 != n3) {
                            object2 = (View)((View)object4).getParent();
                            n4 = ((b$e)object7).i;
                            if ((object2 = object2.findViewById(n4)) != null) {
                                n4 = object2.getTop();
                                float f8 = object2.getBottom() + n4;
                                f6 = 2.0f;
                                f8 /= f6;
                                n16 = object2.getLeft();
                                n7 = object2.getRight() + n16;
                                f7 = (float)n7 / f6;
                                n3 = ((View)object4).getRight();
                                n16 = ((View)object4).getLeft();
                                if ((n3 -= n16) > 0) {
                                    n3 = ((View)object4).getBottom();
                                    n16 = ((View)object4).getTop();
                                    if ((n3 -= n16) > 0) {
                                        f6 = ((View)object4).getLeft();
                                        f7 -= f6;
                                        n3 = ((View)object4).getTop();
                                        f6 = n3;
                                        ((View)object4).setPivotX(f7);
                                        ((View)object4).setPivotY(f8 -= f6);
                                    }
                                }
                            }
                        } else {
                            f7 = ((b$e)object7).g;
                            n7 = (int)(Float.isNaN(f7) ? 1 : 0);
                            if (n7 == 0) {
                                f7 = ((b$e)object7).g;
                                ((View)object4).setPivotX(f7);
                            }
                            if ((n7 = (int)(Float.isNaN(f7 = ((b$e)object7).h) ? 1 : 0)) == 0) {
                                f7 = ((b$e)object7).h;
                                ((View)object4).setPivotY(f7);
                            }
                        }
                        f7 = ((b$e)object7).j;
                        ((View)object4).setTranslationX(f7);
                        f7 = ((b$e)object7).k;
                        ((View)object4).setTranslationY(f7);
                        f7 = ((b$e)object7).l;
                        ((View)object4).setTranslationZ(f7);
                        n7 = (int)(((b$e)object7).m ? 1 : 0);
                        if (n7 != 0) {
                            f5 = ((b$e)object7).n;
                            ((View)object4).setElevation(f5);
                        }
                    }
                }
            }
            ++n15;
        }
        object5 = ((HashSet)object5).iterator();
        while ((n15 = (int)(object5.hasNext() ? 1 : 0)) != 0) {
            object6 = (Integer)object5.next();
            object4 = (b$a)hashMap.get(object6);
            if (object4 == null) continue;
            object2 = ((b$a)object4).e;
            n4 = object2.i0;
            if (n4 == n8) {
                Object object8 = object.getContext();
                object3 = new Barrier((Context)object8);
                n3 = object6;
                object3.setId(n3);
                object8 = object2.j0;
                if (object8 != null) {
                    ((ConstraintHelper)((Object)object3)).setReferencedIds((int[])object8);
                } else {
                    object8 = object2.k0;
                    if (object8 != null) {
                        object8 = androidx.constraintlayout.widget.b.h((Barrier)((Object)object3), (String)object8);
                        object2.j0 = (int[])object8;
                        ((ConstraintHelper)((Object)object3)).setReferencedIds((int[])object8);
                    }
                }
                n3 = object2.g0;
                ((Barrier)((Object)object3)).setType(n3);
                n3 = object2.h0;
                ((Barrier)((Object)object3)).setMargin(n3);
                object8 = ((ConstraintLayout)((Object)object)).generateDefaultLayoutParams();
                ((ConstraintHelper)((Object)object3)).q();
                ((b$a)object4).a((ConstraintLayout$LayoutParams)((Object)object8));
                object.addView((View)object3, (ViewGroup.LayoutParams)object8);
            }
            if ((n7 = (int)(object2.a ? 1 : 0)) == 0) continue;
            object3 = object.getContext();
            object2 = new Guideline((Context)object3);
            n15 = object6;
            object2.setId(n15);
            object6 = ((ConstraintLayout)((Object)object)).generateDefaultLayoutParams();
            ((b$a)object4).a((ConstraintLayout$LayoutParams)((Object)object6));
            object.addView((View)object2, (ViewGroup.LayoutParams)object6);
        }
        while (n14 < n10) {
            object5 = object.getChildAt(n14);
            boolean bl2 = object5 instanceof ConstraintHelper;
            if (bl2) {
                object5 = (ConstraintHelper)((Object)object5);
                ((ConstraintHelper)((Object)object5)).g((ConstraintLayout)((Object)object));
            }
            ++n14;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(ConstraintLayout constraintLayout) {
        Object object = this;
        int n3 = constraintLayout.getChildCount();
        HashMap hashMap = this.g;
        hashMap.clear();
        int n4 = 0;
        while (n4 < n3) {
            Object object2;
            View view = constraintLayout.getChildAt(n4);
            Object object3 = (ConstraintLayout$LayoutParams)view.getLayoutParams();
            int n7 = view.getId();
            int n8 = ((b)object).f;
            if (n8 != 0 && n7 == (n8 = -1)) {
                RuntimeException runtimeException = new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                throw runtimeException;
            }
            Object object4 = n7;
            n8 = (int)(hashMap.containsKey(object4) ? 1 : 0);
            if (n8 == 0) {
                object4 = n7;
                object2 = new b$a();
                hashMap.put(object4, object2);
            }
            object4 = n7;
            if ((object4 = (b$a)hashMap.get(object4)) != null) {
                double d2;
                float f5;
                boolean bl2;
                object2 = ((b)object).e;
                HashMap<String, Object> hashMap2 = new HashMap<String, Object>();
                Class<?> clazz = view.getClass();
                Iterator iterator = ((HashMap)object2).keySet().iterator();
                while (bl2 = iterator.hasNext()) {
                    int n10;
                    Object object5;
                    a a2;
                    String string2;
                    block12: {
                        string2 = (String)iterator.next();
                        a2 = (a)((HashMap)object2).get(string2);
                        object5 = "BackgroundColor";
                        n10 = string2.equals(object5);
                        if (n10 == 0) break block12;
                        object5 = view.getBackground();
                        object5 = (ColorDrawable)object5;
                        n10 = object5.getColor();
                        object5 = n10;
                        object = new a(a2, object5);
                        hashMap2.put(string2, object);
                    }
                    try {
                        object = new StringBuilder();
                        object5 = "getMap";
                        ((StringBuilder)object).append((String)object5);
                        ((StringBuilder)object).append(string2);
                        object = ((StringBuilder)object).toString();
                        n10 = 0;
                        object5 = null;
                        object = clazz.getMethod((String)object, null);
                        object = ((Method)object).invoke((Object)view, null);
                        object5 = new a(a2, object);
                        hashMap2.put(string2, object5);
                    }
                    catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {}
                    object = this;
                }
                ((b$a)object4).g = hashMap2;
                ((b$a)object4).c(n7, (ConstraintLayout$LayoutParams)((Object)object3));
                int n14 = view.getVisibility();
                object3 = ((b$a)object4).c;
                ((b$d)object3).b = n14;
                ((b$d)object3).d = f5 = view.getAlpha();
                f5 = view.getRotation();
                object3 = ((b$a)object4).f;
                ((b$e)object3).b = f5;
                ((b$e)object3).c = f5 = view.getRotationX();
                ((b$e)object3).d = f5 = view.getRotationY();
                ((b$e)object3).e = f5 = view.getScaleX();
                ((b$e)object3).f = f5 = view.getScaleY();
                f5 = view.getPivotX();
                float f6 = view.getPivotY();
                double d5 = f5;
                double d7 = 0.0;
                bl2 = d5 == d7 ? 0 : (d5 > d7 ? 1 : -1);
                if (bl2 || (bl2 = (d2 = (d5 = (double)f6) - d7) == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1))) {
                    ((b$e)object3).g = f5;
                    ((b$e)object3).h = f6;
                }
                ((b$e)object3).j = f5 = view.getTranslationX();
                ((b$e)object3).k = f5 = view.getTranslationY();
                ((b$e)object3).l = f5 = view.getTranslationZ();
                n14 = (int)(((b$e)object3).m ? 1 : 0);
                if (n14 != 0) {
                    ((b$e)object3).n = f5 = view.getElevation();
                }
                if ((n14 = view instanceof Barrier) != 0) {
                    view = (Barrier)view;
                    n14 = (int)(view.getAllowsGoneWidget() ? 1 : 0);
                    object3 = ((b$a)object4).e;
                    ((b$b)object3).o0 = n14;
                    object = view.getReferencedIds();
                    ((b$b)object3).j0 = (int[])object;
                    ((b$b)object3).g0 = n14 = view.getType();
                    ((b$b)object3).h0 = n14 = view.getMargin();
                }
            }
            ++n4;
            object = this;
        }
        return;
    }

    public final void f(int n3, int n4, int n7, int n8) {
        String string2;
        Object object;
        block25: {
            HashMap hashMap = this.g;
            Integer n10 = n3;
            int n14 = hashMap.containsKey(n10);
            if (n14 == 0) {
                n10 = n3;
                b$a b$a = new b$a();
                hashMap.put(n10, b$a);
            }
            object = n3;
            if ((object = (b$a)hashMap.get(object)) == null) {
                return;
            }
            int n15 = 2;
            n14 = 1;
            int n16 = 6;
            int n17 = 7;
            int n18 = 4;
            int n19 = 3;
            String string3 = "right to ";
            string2 = " undefined";
            int n20 = -1;
            object = ((b$a)object).e;
            switch (n4) {
                default: {
                    StringBuilder stringBuilder = new StringBuilder();
                    String string4 = androidx.constraintlayout.widget.b.r(n4);
                    stringBuilder.append(string4);
                    stringBuilder.append(" to ");
                    string4 = androidx.constraintlayout.widget.b.r(n8);
                    stringBuilder.append(string4);
                    stringBuilder.append(" unknown");
                    string4 = stringBuilder.toString();
                    object = new IllegalArgumentException(string4);
                    throw object;
                }
                case 7: {
                    if (n8 == n17) {
                        ((b$b)object).w = n7;
                        ((b$b)object).v = n20;
                        break;
                    }
                    if (n8 == n16) {
                        ((b$b)object).v = n7;
                        ((b$b)object).w = n20;
                        break;
                    }
                    CharSequence charSequence = new StringBuilder(string3);
                    String string5 = androidx.constraintlayout.widget.b.r(n8);
                    charSequence.append(string5);
                    charSequence.append(string2);
                    charSequence = charSequence.toString();
                    object = new IllegalArgumentException((String)charSequence);
                    throw object;
                }
                case 6: {
                    if (n8 == n16) {
                        ((b$b)object).u = n7;
                        ((b$b)object).t = n20;
                        break;
                    }
                    if (n8 == n17) {
                        ((b$b)object).t = n7;
                        ((b$b)object).u = n20;
                        break;
                    }
                    CharSequence charSequence = new StringBuilder(string3);
                    String string6 = androidx.constraintlayout.widget.b.r(n8);
                    charSequence.append(string6);
                    charSequence.append(string2);
                    charSequence = charSequence.toString();
                    object = new IllegalArgumentException((String)charSequence);
                    throw object;
                }
                case 5: {
                    n4 = 5;
                    if (n8 == n4) {
                        ((b$b)object).q = n7;
                        ((b$b)object).p = n20;
                        ((b$b)object).o = n20;
                        ((b$b)object).m = n20;
                        ((b$b)object).n = n20;
                        break;
                    }
                    if (n8 == n19) {
                        ((b$b)object).r = n7;
                        ((b$b)object).p = n20;
                        ((b$b)object).o = n20;
                        ((b$b)object).m = n20;
                        ((b$b)object).n = n20;
                        break;
                    }
                    if (n8 == n18) {
                        ((b$b)object).s = n7;
                        ((b$b)object).p = n20;
                        ((b$b)object).o = n20;
                        ((b$b)object).m = n20;
                        ((b$b)object).n = n20;
                        break;
                    }
                    CharSequence charSequence = new StringBuilder(string3);
                    String string7 = androidx.constraintlayout.widget.b.r(n8);
                    charSequence.append(string7);
                    charSequence.append(string2);
                    charSequence = charSequence.toString();
                    object = new IllegalArgumentException((String)charSequence);
                    throw object;
                }
                case 4: {
                    if (n8 == n18) {
                        ((b$b)object).p = n7;
                        ((b$b)object).o = n20;
                        ((b$b)object).q = n20;
                        ((b$b)object).r = n20;
                        ((b$b)object).s = n20;
                        break;
                    }
                    if (n8 == n19) {
                        ((b$b)object).o = n7;
                        ((b$b)object).p = n20;
                        ((b$b)object).q = n20;
                        ((b$b)object).r = n20;
                        ((b$b)object).s = n20;
                        break;
                    }
                    CharSequence charSequence = new StringBuilder(string3);
                    String string8 = androidx.constraintlayout.widget.b.r(n8);
                    charSequence.append(string8);
                    charSequence.append(string2);
                    charSequence = charSequence.toString();
                    object = new IllegalArgumentException((String)charSequence);
                    throw object;
                }
                case 3: {
                    if (n8 == n19) {
                        ((b$b)object).m = n7;
                        ((b$b)object).n = n20;
                        ((b$b)object).q = n20;
                        ((b$b)object).r = n20;
                        ((b$b)object).s = n20;
                        break;
                    }
                    if (n8 == n18) {
                        ((b$b)object).n = n7;
                        ((b$b)object).m = n20;
                        ((b$b)object).q = n20;
                        ((b$b)object).r = n20;
                        ((b$b)object).s = n20;
                        break;
                    }
                    CharSequence charSequence = new StringBuilder(string3);
                    String string9 = androidx.constraintlayout.widget.b.r(n8);
                    charSequence.append(string9);
                    charSequence.append(string2);
                    charSequence = charSequence.toString();
                    object = new IllegalArgumentException((String)charSequence);
                    throw object;
                }
                case 2: {
                    if (n8 == n14) {
                        ((b$b)object).k = n7;
                        ((b$b)object).l = n20;
                        break;
                    }
                    if (n8 == n15) {
                        ((b$b)object).l = n7;
                        ((b$b)object).k = n20;
                        break;
                    }
                    CharSequence charSequence = new StringBuilder(string3);
                    String string10 = androidx.constraintlayout.widget.b.r(n8);
                    charSequence.append(string10);
                    charSequence.append(string2);
                    charSequence = charSequence.toString();
                    object = new IllegalArgumentException((String)charSequence);
                    throw object;
                }
                case 1: {
                    if (n8 == n14) {
                        ((b$b)object).i = n7;
                        ((b$b)object).j = n20;
                        break;
                    }
                    if (n8 != n15) break block25;
                    ((b$b)object).j = n7;
                    ((b$b)object).i = n20;
                }
            }
            return;
        }
        CharSequence charSequence = new StringBuilder("left to ");
        String string11 = androidx.constraintlayout.widget.b.r(n8);
        charSequence.append(string11);
        charSequence.append(string2);
        charSequence = charSequence.toString();
        object = new IllegalArgumentException((String)charSequence);
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void g(int n3, int n4, int n7, int n8, int n10) {
        String string2;
        Object object;
        block34: {
            block33: {
                int n14;
                int n15;
                block32: {
                    HashMap hashMap = this.g;
                    Integer n16 = n3;
                    int n17 = hashMap.containsKey(n16);
                    if (n17 == 0) {
                        n16 = n3;
                        b$a b$a = new b$a();
                        hashMap.put(n16, b$a);
                    }
                    object = n3;
                    if ((object = (b$a)hashMap.get(object)) == null) {
                        return;
                    }
                    n15 = 2;
                    n17 = 1;
                    int n18 = 6;
                    int n19 = 7;
                    int n20 = 4;
                    int n21 = 3;
                    String string3 = "right to ";
                    string2 = " undefined";
                    n14 = -1;
                    object = ((b$a)object).e;
                    switch (n4) {
                        default: {
                            StringBuilder stringBuilder = new StringBuilder();
                            String string4 = androidx.constraintlayout.widget.b.r(n4);
                            stringBuilder.append(string4);
                            stringBuilder.append(" to ");
                            String string5 = androidx.constraintlayout.widget.b.r(n8);
                            stringBuilder.append(string5);
                            stringBuilder.append(" unknown");
                            String string6 = stringBuilder.toString();
                            object = new IllegalArgumentException(string6);
                            throw object;
                        }
                        case 7: {
                            if (n8 == n19) {
                                ((b$b)object).w = n7;
                                ((b$b)object).v = n14;
                            } else {
                                if (n8 != n18) {
                                    StringBuilder stringBuilder = new StringBuilder(string3);
                                    String string7 = androidx.constraintlayout.widget.b.r(n8);
                                    stringBuilder.append(string7);
                                    stringBuilder.append(string2);
                                    String string8 = stringBuilder.toString();
                                    object = new IllegalArgumentException(string8);
                                    throw object;
                                }
                                ((b$b)object).v = n7;
                                ((b$b)object).w = n14;
                            }
                            ((b$b)object).K = n10;
                            return;
                        }
                        case 6: {
                            if (n8 == n18) {
                                ((b$b)object).u = n7;
                                ((b$b)object).t = n14;
                            } else {
                                if (n8 != n19) {
                                    StringBuilder stringBuilder = new StringBuilder(string3);
                                    String string9 = androidx.constraintlayout.widget.b.r(n8);
                                    stringBuilder.append(string9);
                                    stringBuilder.append(string2);
                                    String string10 = stringBuilder.toString();
                                    object = new IllegalArgumentException(string10);
                                    throw object;
                                }
                                ((b$b)object).t = n7;
                                ((b$b)object).u = n14;
                            }
                            ((b$b)object).L = n10;
                            return;
                        }
                        case 5: {
                            n4 = 5;
                            if (n8 == n4) {
                                ((b$b)object).q = n7;
                                ((b$b)object).p = n14;
                                ((b$b)object).o = n14;
                                ((b$b)object).m = n14;
                                ((b$b)object).n = n14;
                                return;
                            }
                            if (n8 == n21) {
                                ((b$b)object).r = n7;
                                ((b$b)object).p = n14;
                                ((b$b)object).o = n14;
                                ((b$b)object).m = n14;
                                ((b$b)object).n = n14;
                                return;
                            }
                            if (n8 == n20) {
                                ((b$b)object).s = n7;
                                ((b$b)object).p = n14;
                                ((b$b)object).o = n14;
                                ((b$b)object).m = n14;
                                ((b$b)object).n = n14;
                                return;
                            }
                            StringBuilder stringBuilder = new StringBuilder(string3);
                            String string11 = androidx.constraintlayout.widget.b.r(n8);
                            stringBuilder.append(string11);
                            stringBuilder.append(string2);
                            String string12 = stringBuilder.toString();
                            object = new IllegalArgumentException(string12);
                            throw object;
                        }
                        case 4: {
                            if (n8 == n20) {
                                ((b$b)object).p = n7;
                                ((b$b)object).o = n14;
                                ((b$b)object).q = n14;
                                ((b$b)object).r = n14;
                                ((b$b)object).s = n14;
                            } else {
                                if (n8 != n21) {
                                    StringBuilder stringBuilder = new StringBuilder(string3);
                                    String string13 = androidx.constraintlayout.widget.b.r(n8);
                                    stringBuilder.append(string13);
                                    stringBuilder.append(string2);
                                    String string14 = stringBuilder.toString();
                                    object = new IllegalArgumentException(string14);
                                    throw object;
                                }
                                ((b$b)object).o = n7;
                                ((b$b)object).p = n14;
                                ((b$b)object).q = n14;
                                ((b$b)object).r = n14;
                                ((b$b)object).s = n14;
                            }
                            ((b$b)object).J = n10;
                            return;
                        }
                        case 3: {
                            if (n8 == n21) {
                                ((b$b)object).m = n7;
                                ((b$b)object).n = n14;
                                ((b$b)object).q = n14;
                                ((b$b)object).r = n14;
                                ((b$b)object).s = n14;
                            } else {
                                if (n8 != n20) {
                                    StringBuilder stringBuilder = new StringBuilder(string3);
                                    String string15 = androidx.constraintlayout.widget.b.r(n8);
                                    stringBuilder.append(string15);
                                    stringBuilder.append(string2);
                                    String string16 = stringBuilder.toString();
                                    object = new IllegalArgumentException(string16);
                                    throw object;
                                }
                                ((b$b)object).n = n7;
                                ((b$b)object).m = n14;
                                ((b$b)object).q = n14;
                                ((b$b)object).r = n14;
                                ((b$b)object).s = n14;
                            }
                            ((b$b)object).I = n10;
                            return;
                        }
                        case 2: {
                            if (n8 == n17) {
                                ((b$b)object).k = n7;
                                ((b$b)object).l = n14;
                            } else {
                                if (n8 != n15) {
                                    StringBuilder stringBuilder = new StringBuilder(string3);
                                    String string17 = androidx.constraintlayout.widget.b.r(n8);
                                    stringBuilder.append(string17);
                                    stringBuilder.append(string2);
                                    String string18 = stringBuilder.toString();
                                    object = new IllegalArgumentException(string18);
                                    throw object;
                                }
                                ((b$b)object).l = n7;
                                ((b$b)object).k = n14;
                            }
                            ((b$b)object).H = n10;
                            return;
                        }
                        case 1: 
                    }
                    if (n8 != n17) break block32;
                    ((b$b)object).i = n7;
                    ((b$b)object).j = n14;
                    break block33;
                }
                if (n8 != n15) break block34;
                ((b$b)object).j = n7;
                ((b$b)object).i = n14;
            }
            ((b$b)object).G = n10;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Left to ");
        String string19 = androidx.constraintlayout.widget.b.r(n8);
        stringBuilder.append(string19);
        stringBuilder.append(string2);
        String string20 = stringBuilder.toString();
        object = new IllegalArgumentException(string20);
        throw object;
    }

    public final b$a j(int n3) {
        HashMap hashMap = this.g;
        Integer n4 = n3;
        boolean bl2 = hashMap.containsKey(n4);
        if (!bl2) {
            n4 = n3;
            b$a b$a = new b$a();
            hashMap.put(n4, b$a);
        }
        Integer n7 = n3;
        return (b$a)hashMap.get(n7);
    }

    public final b$a k(int n3) {
        HashMap hashMap = this.g;
        Integer n4 = n3;
        boolean bl2 = hashMap.containsKey(n4);
        if (bl2) {
            Integer n7 = n3;
            return (b$a)hashMap.get(n7);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void l(int n3, Context context) {
        Object object = context.getResources();
        XmlResourceParser xmlResourceParser = object.getXml(n3);
        try {
            int n4;
            int n7 = xmlResourceParser.getEventType();
            while (n7 != (n4 = 1)) {
                int n8 = 2;
                if (n7 == n8) {
                    object = xmlResourceParser.getName();
                    AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
                    String string2 = null;
                    b$a b$a = androidx.constraintlayout.widget.b.i(context, attributeSet, false);
                    string2 = "Guideline";
                    n7 = (int)(((String)object).equalsIgnoreCase(string2) ? 1 : 0);
                    if (n7 != 0) {
                        object = b$a.e;
                        ((b$b)object).a = n4;
                    }
                    object = this.g;
                    n4 = b$a.a;
                    Integer n10 = n4;
                    ((HashMap)object).put(n10, b$a);
                }
                n7 = xmlResourceParser.next();
            }
            return;
        }
        catch (IOException | XmlPullParserException throwable) {}
    }

    /*
     * Exception decompiling
     */
    public final void m(Context var1_1, XmlResourceParser var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [99[CASE]], but top level block is 63[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}

