package org.wallerlab.service;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wallerlab.Pdb2Neo4j;
import org.wallerlab.domain.MolecularSystem;
import org.wallerlab.repo.MolecularSystemRepo;

import java.util.List;

/**
 * Created by waller on 27/07/16.
 */
@Service
public class Neo4jItemWriter implements ItemWriter<MolecularSystem> {

    @Autowired MolecularSystemRepo msr;

    @Override
    public void write(List<? extends MolecularSystem> items) throws Exception {
        for(MolecularSystem ms: items)
            msr.save(ms);
    }
}
