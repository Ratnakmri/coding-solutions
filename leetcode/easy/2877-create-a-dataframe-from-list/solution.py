import pandas as pd

def createDataframe(student_data: list) -> pd.DataFrame:
    # Create DataFrame with required columns
    df = pd.DataFrame(student_data, columns=['student_id', 'age'])
    return df
