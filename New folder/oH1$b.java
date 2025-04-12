/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import kotlin.ranges.f;
import kotlin.sequences.Sequence;
import kotlin.text.MatchGroup;

public final class oH1$b
extends f0_0 {
    public final /* synthetic */ oh1_1 a;

    public oH1$b(oh1_1 oh1_12) {
        this.a = oh1_12;
    }

    public final int a() {
        return this.a.a.groupCount() + 1;
    }

    public final MatchGroup c(int n3) {
        MatchGroup matchGroup;
        Object object = this.a;
        Object object2 = ((oh1_1)object).a;
        int n4 = ((Matcher)object2).start(n3);
        int n7 = ((Matcher)object2).end(n3);
        object2 = f.m(n4, n7);
        n4 = ((c)object2).a;
        if (n4 >= 0) {
            String string2 = ((oh1_1)object).a.group(n3);
            object = "group(...)";
            Intrinsics.checkNotNullExpressionValue(string2, (String)object);
            matchGroup = new MatchGroup(string2, (IntRange)object2);
        } else {
            n4 = 0;
            matchGroup = null;
        }
        return matchGroup;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final Iterator iterator() {
        Sequence sequence = CollectionsKt.E(xx_2.g(this));
        Object object = new oH1$b$a(this);
        sequence = kz2_1.i(sequence, (Function1)object);
        object = new fr3$a((fr3_0)sequence);
        return object;
    }
}

