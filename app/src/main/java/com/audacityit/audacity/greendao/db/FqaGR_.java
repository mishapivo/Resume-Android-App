package com.audacityit.audacity.greendao.db;

import com.audacityit.audacity.greendao.db.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "FQA_GR_".
 */
public class FqaGR_ {

    private Long id;
    private String question;
    private String answer;
    private long fqa_id;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient FqaGR_Dao myDao;

    private FqaGR fqaGR;
    private Long fqaGR__resolvedKey;


    public FqaGR_() {
    }

    public FqaGR_(Long id) {
        this.id = id;
    }

    public FqaGR_(Long id, String question, String answer, long fqa_id) {
        this.id = id;
        this.question = question;
        this.answer = answer;
        this.fqa_id = fqa_id;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getFqaGR_Dao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public long getFqa_id() {
        return fqa_id;
    }

    public void setFqa_id(long fqa_id) {
        this.fqa_id = fqa_id;
    }

    /** To-one relationship, resolved on first access. */
    public FqaGR getFqaGR() {
        long __key = this.fqa_id;
        if (fqaGR__resolvedKey == null || !fqaGR__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            FqaGRDao targetDao = daoSession.getFqaGRDao();
            FqaGR fqaGRNew = targetDao.load(__key);
            synchronized (this) {
                fqaGR = fqaGRNew;
            	fqaGR__resolvedKey = __key;
            }
        }
        return fqaGR;
    }

    public void setFqaGR(FqaGR fqaGR) {
        if (fqaGR == null) {
            throw new DaoException("To-one property 'fqa_id' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.fqaGR = fqaGR;
            fqa_id = fqaGR.getId();
            fqaGR__resolvedKey = fqa_id;
        }
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

}