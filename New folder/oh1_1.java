/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.regex.Matcher;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import kotlin.text.MatchResult;

/*
 * Renamed from oH1
 */
public final class oh1_1
implements MatchResult {
    public final Matcher a;
    public final CharSequence b;
    public final oH1$b c;
    public oH1$a d;

    public oh1_1(Matcher object, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(object, "matcher");
        Intrinsics.checkNotNullParameter(charSequence, "input");
        this.a = object;
        this.b = charSequence;
        this.c = object = new oH1$b(this);
    }

    public final List a() {
        oH1$a oH1$a = this.d;
        if (oH1$a == null) {
            this.d = oH1$a = new oH1$a(this);
        }
        oH1$a = this.d;
        Intrinsics.checkNotNull(oH1$a);
        return oH1$a;
    }

    public final oH1$b b() {
        return this.c;
    }

    public final IntRange getRange() {
        Matcher matcher = this.a;
        int n3 = matcher.start();
        int n4 = matcher.end();
        return f.m(n3, n4);
    }

    public final oh1_1 next() {
        CharSequence charSequence;
        int n3;
        Matcher matcher = this.a;
        int n4 = matcher.end();
        int n7 = matcher.end();
        if (n7 == (n3 = matcher.start())) {
            n7 = 1;
        } else {
            n7 = 0;
            charSequence = null;
        }
        charSequence = this.b;
        n3 = charSequence.length();
        oh1_1 oh1_12 = null;
        if ((n4 += n7) <= n3) {
            matcher = matcher.pattern().matcher(charSequence);
            String string2 = "matcher(...)";
            Intrinsics.checkNotNullExpressionValue(matcher, string2);
            n4 = (int)(matcher.find(n4) ? 1 : 0);
            if (n4 != 0) {
                oh1_12 = new oh1_1(matcher, charSequence);
            }
        }
        return oh1_12;
    }
}

