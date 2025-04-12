/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex$a;
import kotlin.text.Regex$b;
import kotlin.text.StringsKt__StringsKt;

public final class Regex
implements Serializable {
    public static final Regex$a b;
    public final Pattern a;

    static {
        Regex$a regex$a;
        b = regex$a = new Regex$a(null);
    }

    public Regex() {
        throw null;
    }

    public Regex(String object) {
        Intrinsics.checkNotNullParameter(object, "pattern");
        object = Pattern.compile((String)object);
        Intrinsics.checkNotNullExpressionValue(object, "compile(...)");
        this((Pattern)object);
    }

    public Regex(Pattern pattern) {
        Intrinsics.checkNotNullParameter(pattern, "nativePattern");
        this.a = pattern;
    }

    public static oh1_1 a(Regex object, CharSequence charSequence) {
        object.getClass();
        Intrinsics.checkNotNullParameter(charSequence, "input");
        object = ((Regex)object).a.matcher(charSequence);
        Intrinsics.checkNotNullExpressionValue(object, "matcher(...)");
        oh1_1 oh1_12 = null;
        boolean bl2 = ((Matcher)object).find(0);
        if (!bl2) {
            object = null;
        } else {
            oh1_12 = new oh1_1((Matcher)object, charSequence);
            object = oh1_12;
        }
        return object;
    }

    private final Object writeReplace() {
        Pattern pattern = this.a;
        String string2 = pattern.pattern();
        Intrinsics.checkNotNullExpressionValue(string2, "pattern(...)");
        int n3 = pattern.flags();
        Regex$b regex$b = new Regex$b(string2, n3);
        return regex$b;
    }

    public final oh1_1 b(CharSequence object) {
        Intrinsics.checkNotNullParameter(object, "input");
        Matcher matcher = this.a.matcher((CharSequence)object);
        Object object2 = "matcher(...)";
        Intrinsics.checkNotNullExpressionValue(matcher, (String)object2);
        boolean bl2 = matcher.matches();
        object = !bl2 ? null : (object2 = new oh1_1(matcher, (CharSequence)object));
        return object;
    }

    public final boolean c(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "input");
        return this.a.matcher(charSequence).matches();
    }

    public final String d(String string2) {
        Intrinsics.checkNotNullParameter(string2, "input");
        String string3 = "";
        Intrinsics.checkNotNullParameter(string3, "replacement");
        string2 = this.a.matcher(string2).replaceFirst(string3);
        Intrinsics.checkNotNullExpressionValue(string2, "replaceFirst(...)");
        return string2;
    }

    public final List e(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "input");
        int n3 = 0;
        String string2 = null;
        StringsKt__StringsKt.y(0);
        Matcher matcher = this.a.matcher(charSequence);
        boolean bl2 = matcher.find();
        if (!bl2) {
            return kotlin.collections.a.b(((Object)charSequence).toString());
        }
        int n4 = 10;
        ArrayList<CharSequence> arrayList = new ArrayList<CharSequence>(n4);
        do {
            n4 = matcher.start();
            string2 = ((Object)charSequence.subSequence(n3, n4)).toString();
            arrayList.add(string2);
            n3 = matcher.end();
        } while ((n4 = (int)(matcher.find() ? 1 : 0)) != 0);
        int n7 = charSequence.length();
        charSequence = ((Object)charSequence.subSequence(n3, n7)).toString();
        arrayList.add(charSequence);
        return arrayList;
    }

    public final String replace(CharSequence charSequence, String string2) {
        Intrinsics.checkNotNullParameter(charSequence, "input");
        Intrinsics.checkNotNullParameter(string2, "replacement");
        charSequence = this.a.matcher(charSequence).replaceAll(string2);
        Intrinsics.checkNotNullExpressionValue(charSequence, "replaceAll(...)");
        return charSequence;
    }

    public final String toString() {
        String string2 = this.a.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }
}

