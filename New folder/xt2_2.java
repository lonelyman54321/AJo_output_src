/*
 * Decompiled with CFR 0.152.
 */
import kotlin.text.Regex;

/*
 * Renamed from xT2
 */
public final class xt2_2 {
    public static final xt2_2 a;
    public static final Regex b;

    static {
        Object object = new Object();
        a = object;
        b = object = new Regex("[\\x00-\\x20]*[+-]?(NaN|Infinity|((((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)([eE][+-]?(\\p{Digit}+))?)|(\\.((\\p{Digit}+))([eE][+-]?(\\p{Digit}+))?)|(((0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+)))[pP][+-]?(\\p{Digit}+)))[fFdD]?))[\\x00-\\x20]*");
    }
}

