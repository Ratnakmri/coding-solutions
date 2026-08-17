import pandas as pd

def changeDatatype(students: pd.DataFrame) -> pd.DataFrame:
    # Convert student_id column to string type
    students['grade'] = students['grade'].astype(int)
    return students
