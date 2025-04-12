/*
 * Decompiled with CFR 0.152.
 */
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;

/*
 * Renamed from dj3
 */
public final class dj3_2 {
    public static /* bridge */ /* synthetic */ UserPrincipal a(UserPrincipalLookupService userPrincipalLookupService, String string2) {
        return userPrincipalLookupService.lookupPrincipalByName(string2);
    }
}

