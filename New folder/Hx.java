/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.SpannableStringBuilder
 *  android.text.TextUtils
 */
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.Locale;

public final class Hx {
    public static final String d;
    public static final String e;
    public static final Hx f;
    public static final Hx g;
    public final boolean a;
    public final int b;
    public final Qj3 c;

    static {
        Object object = Rj3.c;
        d = Character.toString('\u200e');
        e = Character.toString('\u200f');
        f = object = new Hx(false);
        g = object = new Hx(true);
    }

    public Hx(boolean bl2) {
        Rj3$d rj3$d = Rj3.c;
        this.a = bl2;
        this.b = 2;
        this.c = rj3$d;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int a(CharSequence charSequence) {
        Hx$a hx$a = new Hx$a(charSequence);
        int n3 = 0;
        charSequence = null;
        hx$a.c = 0;
        int n4 = 0;
        int n7 = 0;
        int n8 = 0;
        while (true) {
            block21: {
                block19: {
                    block20: {
                        Object object = hx$a.c;
                        int n10 = hx$a.b;
                        Object object2 = 1;
                        if (object >= n10 || n4 != 0) break;
                        Object object3 = hx$a.a;
                        object = object3.charAt((int)object);
                        hx$a.d = object;
                        if ((object = (Object)Character.isHighSurrogate(object)) != 0) {
                            int n14;
                            Object object = hx$a.c;
                            object = Character.codePointAt((CharSequence)object3, (int)object);
                            n10 = hx$a.c;
                            hx$a.c = n14 = Character.charCount(object) + n10;
                            object = Character.getDirectionality((int)object);
                        } else {
                            object = hx$a.c + object2;
                            hx$a.c = object;
                            object = hx$a.d;
                            n10 = 1792;
                            if (object < n10) {
                                object3 = Hx$a.e;
                                object = object3[object];
                            } else {
                                object = Character.getDirectionality(object);
                            }
                        }
                        if (object == '\u0000') break block19;
                        if (object == object2 || object == (n10 = 2)) break block20;
                        n10 = 9;
                        if (object == n10) continue;
                        switch (object) {
                            default: {
                                break block21;
                            }
                            case '\u0012': {
                                n8 += -1;
                                n7 = 0;
                                break;
                            }
                            case '\u0010': 
                            case '\u0011': {
                                ++n8;
                                n7 = 1;
                                break;
                            }
                            case '\u000e': 
                            case '\u000f': {
                                ++n8;
                                n7 = -1;
                                break;
                            }
                        }
                        continue;
                    }
                    if (n8 == 0) {
                        return 1;
                    }
                    break block21;
                }
                if (n8 == 0) return -1;
            }
            n4 = n8;
        }
        if (n4 == 0) {
            return n3;
        }
        if (n7 != 0) {
            return n7;
        }
        block11: while ((n7 = hx$a.c) > 0) {
            n7 = hx$a.a();
            switch (n7) {
                default: {
                    continue block11;
                }
                case 18: {
                    ++n8;
                    continue block11;
                }
                case 16: 
                case 17: {
                    if (n4 != n8) break;
                    return 1;
                }
                case 14: 
                case 15: {
                    if (n4 == n8) return -1;
                }
            }
            n8 += -1;
        }
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int b(CharSequence charSequence) {
        int n3;
        int n4;
        Hx$a hx$a = new Hx$a(charSequence);
        hx$a.c = n4 = hx$a.b;
        n4 = 0;
        charSequence = null;
        int n7 = 0;
        int n8 = 0;
        block5: while ((n3 = hx$a.c) > 0) {
            block12: {
                block10: {
                    block11: {
                        int n10;
                        n3 = hx$a.a();
                        if (n3 == 0) break block10;
                        int n14 = 1;
                        if (n3 == n14 || n3 == (n10 = 2)) break block11;
                        n10 = 9;
                        if (n3 == n10) continue;
                        switch (n3) {
                            default: {
                                if (n8 != 0) continue block5;
                                break block12;
                            }
                            case 18: {
                                ++n7;
                                continue block5;
                            }
                            case 16: 
                            case 17: {
                                if (n8 != n7) break;
                                return 1;
                            }
                            case 14: 
                            case 15: {
                                if (n8 == n7) return -1;
                            }
                        }
                        n7 += -1;
                        continue;
                    }
                    if (n7 == 0) {
                        return 1;
                    }
                    if (n8 != 0) continue;
                    break block12;
                }
                if (n7 == 0) {
                    return -1;
                }
                if (n8 != 0) continue;
            }
            n8 = n7;
        }
        return n4;
    }

    public static Hx c() {
        int n3;
        Object object = Locale.getDefault();
        int n4 = TextUtils.getLayoutDirectionFromLocale((Locale)object);
        if (n4 != (n3 = 1)) {
            n3 = 0;
        }
        object = n3 != 0 ? g : f;
        return object;
    }

    public final SpannableStringBuilder d(CharSequence charSequence, Qj3 qj3) {
        int n3;
        if (charSequence == null) {
            return null;
        }
        int n4 = charSequence.length();
        qj3 = (Rj3$c)qj3;
        boolean bl2 = ((Rj3$c)qj3).b(n4, charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int n7 = this.b & 2;
        String string2 = "";
        String string3 = e;
        int n8 = -1;
        String string4 = d;
        int n10 = 1;
        boolean bl3 = this.a;
        if (n7 != 0) {
            Object object = bl2 ? Rj3.b : Rj3.a;
            int n14 = charSequence.length();
            n7 = ((Rj3$c)object).b(n14, charSequence) ? 1 : 0;
            object = !bl3 && (n7 != 0 || (n14 = Hx.a(charSequence)) == n10) ? string4 : (bl3 && (n7 == 0 || (n7 = Hx.a(charSequence)) == n8) ? string3 : string2);
            spannableStringBuilder.append((CharSequence)object);
        }
        if (bl2 != bl3) {
            n7 = bl2 ? 8235 : 8234;
            spannableStringBuilder.append((char)n7);
            spannableStringBuilder.append(charSequence);
            n7 = 8236;
            spannableStringBuilder.append((char)n7);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        qj3 = bl2 ? Rj3.b : Rj3.a;
        n7 = charSequence.length();
        bl2 = ((Rj3$c)qj3).b(n7, charSequence);
        if (!bl3 && (bl2 || (n7 = Hx.b(charSequence)) == n10)) {
            string2 = string4;
        } else if (bl3 && (!bl2 || (n3 = Hx.b(charSequence)) == n8)) {
            string2 = string3;
        }
        spannableStringBuilder.append((CharSequence)string2);
        return spannableStringBuilder;
    }
}

