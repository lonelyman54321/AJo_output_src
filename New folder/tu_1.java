/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.base.Predicate;
import com.google.common.reflect.ClassPath$ClassInfo;

/*
 * Renamed from TU
 */
public final class tu_1
implements Predicate {
    public final boolean apply(Object object) {
        return ((ClassPath$ClassInfo)object).isTopLevel();
    }
}

