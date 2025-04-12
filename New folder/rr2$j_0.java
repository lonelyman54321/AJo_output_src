/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 */
import android.graphics.Matrix;
import com.caverock.androidsvg.SVGParseException;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.SAXException;

/*
 * Renamed from rR2$j
 */
public abstract class rr2$j_0
extends rR2$L
implements rR2$J {
    public List h;
    public Boolean i;
    public Matrix j;
    public rR2$k k;
    public String l;

    public rr2$j_0() {
        ArrayList arrayList;
        this.h = arrayList = new ArrayList();
    }

    public final List b() {
        return this.h;
    }

    public final void g(rR2$N object) {
        boolean bl2 = object instanceof rR2$D;
        if (bl2) {
            this.h.add(object);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Gradient elements cannot contain ");
        stringBuilder.append(object);
        stringBuilder.append(" elements.");
        object = stringBuilder.toString();
        SVGParseException sVGParseException = new SAXException((String)object);
        throw sVGParseException;
    }
}

