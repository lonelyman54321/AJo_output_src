/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
package com.ril.ajio.data.repo;

import android.app.Application;
import com.ril.ajio.data.repo.UserRepo;
import javax.inject.Provider;

public final class UserRepo_Factory
implements nb2_2 {
    private final nb2_2 contextProvider;

    public UserRepo_Factory(nb2_2 nb2_22) {
        this.contextProvider = nb2_22;
    }

    public static UserRepo_Factory create(nb2_2 nb2_22) {
        UserRepo_Factory userRepo_Factory = new UserRepo_Factory(nb2_22);
        return userRepo_Factory;
    }

    public static UserRepo_Factory create(Provider provider) {
        provider = ob2_2.a(provider);
        UserRepo_Factory userRepo_Factory = new UserRepo_Factory((nb2_2)provider);
        return userRepo_Factory;
    }

    public static UserRepo newInstance(Application application) {
        UserRepo userRepo = new UserRepo(application);
        return userRepo;
    }

    public UserRepo get() {
        return UserRepo_Factory.newInstance((Application)this.contextProvider.get());
    }
}

