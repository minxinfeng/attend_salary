# attend_salary
Calculate the salary of exact month instead of manually based on collect the statistics of attendance, workload。 记录员工的出勤/工件数等，并生成相关报表。

# Requirement
1. 登陆（初次登陆，选择公司；若不存在，新增)
2. 编辑相应的工件信息，包括名称/单价
3. 录入相关工件数量。表单行标题为现有的工件名称(包括单价)，列为当前日期。用户输入相应件数，默认为0
4. 工时管理(请假与否)
5. 统计某个月的工资数，包括工件基本工资+出勤+绩效等(绩效=(工件基本工资-base)*rate%)，每个工件的总数，并生成相关报表


# Point
1. 工件单价发生改变，如何确保之前的工资统计信息的准确性？
