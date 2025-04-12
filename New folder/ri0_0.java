/*
 * Decompiled with CFR 0.152.
 */
import androidx.window.core.WindowStrictModeException;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from RI0
 */
public final class ri0_0
extends ha3 {
    public final Object a;
    public final String b;
    public final String c;
    public final tu1_2 d;
    public final ha3$b e;
    public final WindowStrictModeException f;

    public ri0_0(Object object, String object2, String stackTraceElementArray, tu1_2 tu1_22, ha3$b ha3$b) {
        Intrinsics.checkNotNullParameter(object, "value");
        Intrinsics.checkNotNullParameter(object2, "tag");
        ArrayList<Object> arrayList = "message";
        Intrinsics.checkNotNullParameter(stackTraceElementArray, (String)((Object)arrayList));
        Intrinsics.checkNotNullParameter(tu1_22, "logger");
        Object object3 = "verificationMode";
        Intrinsics.checkNotNullParameter((Object)ha3$b, (String)object3);
        this.a = object;
        this.b = object2;
        this.c = stackTraceElementArray;
        this.d = tu1_22;
        this.e = ha3$b;
        object = ha3.b(object, (String)stackTraceElementArray);
        Intrinsics.checkNotNullParameter(object, (String)((Object)arrayList));
        object2 = new Exception((String)object);
        object = ((Throwable)object2).getStackTrace();
        Intrinsics.checkNotNullExpressionValue(object, "stackTrace");
        stackTraceElementArray = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)stackTraceElementArray);
        int n3 = ((StackTraceElement[])object).length + -2;
        ha3$b = null;
        if (n3 < 0) {
            n3 = 0;
            tu1_22 = null;
        }
        Intrinsics.checkNotNullParameter(object, (String)stackTraceElementArray);
        if (n3 >= 0) {
            if (n3 == 0) {
                object = mz0_2.a;
            } else {
                int n4 = ((StackTraceElement[])object).length;
                if (n3 >= n4) {
                    object = tp_2.M((Object[])object);
                } else {
                    int n7 = 1;
                    if (n3 == n7) {
                        object = kotlin.collections.a.b(object[n4 -= n7]);
                    } else {
                        arrayList = new ArrayList<Object>(n3);
                        for (n3 = n4 - n3; n3 < n4; ++n3) {
                            object3 = object[n3];
                            arrayList.add(object3);
                        }
                        object = arrayList;
                    }
                }
            }
            object = (Collection)object;
            stackTraceElementArray = new StackTraceElement[]{};
            object = object.toArray(stackTraceElementArray);
            if (object != null) {
                object = (StackTraceElement[])object;
                ((Throwable)object2).setStackTrace((StackTraceElement[])object);
                this.f = object2;
                return;
            }
            object = new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            throw object;
        }
        object = Gj0.b(n3, "Requested element count ", " is less than zero.");
        object = object.toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public final Object a() {
        Object object = RI0$a.$EnumSwitchMapping$0;
        Object object2 = this.e;
        int n3 = ((Enum)object2).ordinal();
        int n4 = object[n3];
        if (n4 != (n3 = 1)) {
            n3 = 2;
            if (n4 != n3) {
                n3 = 3;
                if (n4 != n3) {
                    object = new NoWhenBranchMatchedException;
                    object();
                    throw object;
                }
            } else {
                object = this.a;
                object2 = this.c;
                object = ha3.b(object, (String)object2);
                object2 = this.d;
                String string2 = this.b;
                ((tu1_2)object2).b(string2, (String)object);
            }
            return null;
        }
        throw this.f;
    }

    public final ha3 c(String string2, Function1 function1) {
        Intrinsics.checkNotNullParameter(string2, "message");
        Intrinsics.checkNotNullParameter(function1, "condition");
        return this;
    }
}

