/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from HZ2
 */
public final class hz2_2
extends Lambda
implements Function1 {
    public final /* synthetic */ int c;

    public hz2_2(int n3) {
        this.c = n3;
        super(1);
    }

    public final Object a(int n3) {
        CharSequence charSequence = new StringBuilder("Sequence doesn't contain element at index ");
        int n4 = this.c;
        charSequence = tu.a(charSequence, n4, '.');
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException((String)charSequence);
        throw indexOutOfBoundsException;
    }
}

