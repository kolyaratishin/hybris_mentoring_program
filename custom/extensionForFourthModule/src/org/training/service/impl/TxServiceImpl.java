package org.training.service.impl;

import de.hybris.platform.core.Registry;
import de.hybris.platform.tx.Transaction;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;
import org.training.service.TxService;



public class TxServiceImpl implements TxService {
    @Override
    public void performWithinTxApi(int x) {
        Transaction tx = Transaction.current();
        tx.begin();
        if(x>0){
            tx.commit();
            System.out.println("Method commited with Tx API");
        }
        else {
            tx.rollback();
            System.out.println("Method rolled back with Tx API");
        }
    }

    @Override
    public void performWithinTxTemplate(int x) {
        PlatformTransactionManager manager = (PlatformTransactionManager) Registry.getApplicationContext().getBean("txManager");
        TransactionTemplate tx = new TransactionTemplate(manager);
        tx.executeWithoutResult((status) -> System.out.println("Method performed with Tx template"));
    }
}
