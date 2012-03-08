package com.onarandombox.multiverseinventories.api.share;

import com.onarandombox.multiverseinventories.api.profile.PlayerProfile;
import com.onarandombox.multiverseinventories.share.Shares;

/**
 * Simple interface for groups that are going to be saved/loaded.
 */
public interface PersistingProfile {

    /**
     * @return The name used in the plugin's data to identify this the underlying profile.
     */
    String getDataName();

    /**
     * @return The shares that will be saved/loaded for.  This set are all the sharable things
     *         that will be acted upon when passed through
     *         {@link com.onarandombox.multiverseinventories.ShareHandler}
     */
    Shares getShares();

    /**
     * @return The player profile for the world/group that will be saved/loaded for.
     */
    PlayerProfile getProfile();
}
