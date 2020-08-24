select *
from employees e
    left join dept_manager dm on e.emp_no = dm.emp_no
    limit 100
    
    where dept_no is null limit 100