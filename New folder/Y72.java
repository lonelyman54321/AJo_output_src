/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractList;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class Y72
extends Lambda
implements Function1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ Y72(Object object, int n3) {
        this.c = n3;
        this.d = object;
        super(1);
    }

    public final Object invoke(Object object) {
        W72 w72;
        block6: {
            int n3 = this.c;
            switch (n3) {
                default: {
                    object = (UY2)object;
                    nl1_0 nl1_02 = (nl1_0)this.d;
                    uo3_0.a((UY2)object, nl1_02);
                    return Unit.a;
                }
                case 0: 
            }
            object = (uu_0)object;
            Intrinsics.checkNotNullParameter(object, "backEvent");
            ListIterator listIterator = (d82_0)this.d;
            w72 = ((d82_0)((Object)listIterator)).d;
            if (w72 == null) {
                listIterator = ((d82_0)((Object)listIterator)).c;
                int n4 = ((e1_0)((Object)listIterator)).size();
                listIterator = ((AbstractList)((Object)listIterator)).listIterator(n4);
                while ((n4 = (int)(listIterator.hasPrevious() ? 1 : 0)) != 0) {
                    W72 w722 = w72 = listIterator.previous();
                    w722 = w72;
                    boolean bl2 = w722.isEnabled();
                    if (!bl2) continue;
                    break block6;
                }
                n4 = 0;
                w72 = null;
            }
        }
        if (w72 != null) {
            w72.handleOnBackProgressed((uu_0)object);
        }
        return Unit.a;
    }
}

