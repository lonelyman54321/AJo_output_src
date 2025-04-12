/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 */
import android.content.res.Resources;
import java.util.Objects;

public final class WK2$c {
    public final Resources a;
    public final Resources.Theme b;

    public WK2$c(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object object) {
        Resources resources;
        Resources resources2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (resources2 = WK2$c.class) == (resources = object.getClass())) {
            boolean bl3;
            object = (WK2$c)object;
            resources = this.a;
            resources2 = ((WK2$c)object).a;
            boolean bl4 = resources.equals(resources2);
            if (!bl4 || !(bl3 = Objects.equals(resources = this.b, object = ((WK2$c)object).b))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        Resources resources = this.a;
        Resources.Theme theme = this.b;
        Object[] objectArray = new Object[]{resources, theme};
        return Objects.hash(objectArray);
    }
}

