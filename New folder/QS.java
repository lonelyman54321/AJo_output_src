/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;

public final class QS {
    public static final void a(long l2, pg2_0 pg2_02) {
        block7: {
            block6: {
                int n3;
                block5: {
                    pg2_0 pg2_03 = pg2_0.Vertical;
                    n3 = -1 >>> 1;
                    if (pg2_02 != pg2_03) break block5;
                    int n4 = c60.h(l2);
                    if (n4 == n3) {
                        String string2 = "Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString();
                        IllegalStateException illegalStateException = new IllegalStateException(string2);
                        throw illegalStateException;
                    }
                    break block6;
                }
                int n7 = c60.i(l2);
                if (n7 == n3) break block7;
            }
            return;
        }
        String string3 = "Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string3);
        throw illegalStateException;
    }

    public static void b(Bundle object, String string2) {
        boolean bl2 = object.containsKey(string2);
        if (bl2) {
            return;
        }
        string2 = "Bundle must contain ".concat(string2);
        object = new IllegalArgumentException(string2);
        throw object;
    }
}

