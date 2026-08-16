import pandas as pd

def dropMissingData(students: pd.DataFrame) -> pd.DataFrame:
    students=students.replace("null",pd.NA)
    return students.dropna(subset=["student_id","name"])