/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.DisplayCutout
 */
import android.view.DisplayCutout;
import java.util.Objects;

public final class or0 {
    public final DisplayCutout a;

    public or0(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final boolean equals(Object object) {
        DisplayCutout displayCutout;
        Class<or0> clazz;
        if (this == object) {
            return true;
        }
        if (object != null && (clazz = or0.class) == (displayCutout = object.getClass())) {
            object = (or0)object;
            displayCutout = this.a;
            object = ((or0)object).a;
            return Objects.equals(displayCutout, object);
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        DisplayCutout displayCutout = this.a;
        if (displayCutout == null) {
            n3 = 0;
            displayCutout = null;
        } else {
            n3 = nr0.a(displayCutout);
        }
        return n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DisplayCutoutCompat{");
        DisplayCutout displayCutout = this.a;
        stringBuilder.append(displayCutout);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

