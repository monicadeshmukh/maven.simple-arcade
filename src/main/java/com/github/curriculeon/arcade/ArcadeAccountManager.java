package com.github.curriculeon.arcade;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 7/21/2020.
 * `ArcadeAccountManager` stores, manages, and retrieves `ArcadeAccount` objects
 * it is advised that every instruction in this class is logged
 */

/**
 * Implemented by Monica Deshmukh
 * 07/29/2020
 */

public class ArcadeAccountManager {
    List<ArcadeAccount> arcadeAccountList = new ArrayList<ArcadeAccount>();
    /**
     * @param accountName name of account to be returned
     * @param accountPassword password of account to be returned
     * @return `ArcadeAccount` with specified `accountName` and `accountPassword`
     */
    public ArcadeAccount getAccount(String accountName, String accountPassword) {
        for (ArcadeAccount arcadeAccount: arcadeAccountList) {
            if(arcadeAccount.getAccountName().equals(accountName) && arcadeAccount.getAccountPassword().equals(accountPassword))
                return arcadeAccount;
        }
        return null;
    }

    /**
     * logs & creates a new `ArcadeAccount`
     * @param accountName name of account to be created
     * @param accountPassword password of account to be created
     * @return new instance of `ArcadeAccount` with specified `accountName` and `accountPassword`
     */
    public ArcadeAccount createAccount(String accountName, String accountPassword) {
        ArcadeAccount arcadeAccount = new ArcadeAccount(accountName, accountPassword);
        return arcadeAccount;
    }

    /**
     * logs & registers a new `ArcadeAccount` to `this.getArcadeAccountList()`
     * @param arcadeAccount the arcadeAccount to be added to `this.getArcadeAccountList()`
     */
    public void registerAccount(ArcadeAccount arcadeAccount) {
        this.arcadeAccountList.add(arcadeAccount);
    }
}
