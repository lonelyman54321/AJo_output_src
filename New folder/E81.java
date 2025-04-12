/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.HomeRepo;
import com.ril.ajio.services.data.Home.Child;
import java.util.Comparator;

public final class E81
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = (Child)object;
        object2 = (Child)object2;
        return HomeRepo.Q((Child)object, (Child)object2);
    }
}

