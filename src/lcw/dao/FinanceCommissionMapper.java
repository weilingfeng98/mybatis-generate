package lcw.dao;

import lcw.model.FinanceCommission;

public interface FinanceCommissionMapper {
    int deleteByPrimaryKey(Long commissionId);

    int insert(FinanceCommission record);

    int insertSelective(FinanceCommission record);

    FinanceCommission selectByPrimaryKey(Long commissionId);

    int updateByPrimaryKeySelective(FinanceCommission record);

    int updateByPrimaryKey(FinanceCommission record);
}