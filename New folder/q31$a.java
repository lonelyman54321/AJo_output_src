/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.ranges.IntRange;
import kotlin.text.MatchResult;

public final class q31$a
extends Lambda
implements Function1 {
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ Ref$IntRef d;

    public q31$a(Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2) {
        this.c = ref$IntRef;
        this.d = ref$IntRef2;
        super(1);
    }

    public final Object invoke(Object object) {
        int n3;
        object = (MatchResult)object;
        Ref$IntRef ref$IntRef = this.c;
        int n4 = ref$IntRef.element;
        int n7 = -1;
        if (n4 == n7) {
            IntRange intRange = object.getRange();
            ref$IntRef.element = n4 = intRange.a;
        }
        this.d.element = n3 = object.getRange().b + 1;
        return "";
    }
}

