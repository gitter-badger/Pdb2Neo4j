package org.wallerlab.service;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wallerlab.domain.MolecularSystem;
import org.wallerlab.repo.MolecularSystemRepo;

import java.util.List;

@Service
public class Writer implements ItemWriter<MolecularSystem> {

    @Autowired MolecularSystemRepo msr;

    @Override
    public void write(List<? extends MolecularSystem> items) throws Exception {
        for(MolecularSystem ms: items)
            msr.save(ms);
    }
}
